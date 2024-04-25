package FinalContent.sortAlgs;

public class Quick {
    
    // divide function partitions the array around a pivot point (last elem in array)
    // sorts elements on either side of pivot (all less go on left, all greater go on right)
    // returns index at which division is completed
    public static int divide(int arr[], int first, int last) {
        int pivot = arr[last];
        int i = first -1;
        for (int j = first; j <= last -1; j++) {
            if (arr[j] <= pivot) {
                i = i+1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[last];
        arr[last] = temp;
        
        return i+1;
    }
    
    // repeated process for double
    public static int divide(double arr[], int first, int last) {
        double pivot = arr[last];
        int i = first -1;
        for (int j = first; j <= last -1; j++) {
            if (arr[j] <= pivot) {
                i = i+1;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        double temp = arr[i+1];
        arr[i+1] = arr[last];
        arr[last] = temp;
        
        return i+1;
    }

    // repeated process for string
    public static int divide(String arr[], int first, int last) {
        String pivot = arr[last];
        int i = first -1;
        for (int j = first; j <= last -1; j++) {
            if (arr[j].compareTo(pivot) >= 0) {
                i = i+1;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i+1];
        arr[i+1] = arr[last];
        arr[last] = temp;
        
        return i+1;
    }

    // private quickSort method to take in more parameters than public can due to group main constraints
    // recursively divides array and sorts
    private static void quickSort(int arr[], int first, int last) {
        if (first < last) {
            int pivotIndex = divide(arr, first, last);
            quickSort(arr, first, pivotIndex-1);
            quickSort(arr, pivotIndex+1, last);
        }    
    }

    // repeated process for double
    private static void quickSort(double arr[], int first, int last) {
        if (first < last) {
            int pivotIndex = divide(arr, first, last);
            quickSort(arr, first, pivotIndex-1);
            quickSort(arr, pivotIndex+1, last);
        }    
    }

    // repeated process for string
    private static void quickSort(String arr[], int first, int last) {
        if (first < last) {
            int pivotIndex = divide(arr, first, last);
            quickSort(arr, first, pivotIndex-1);
            quickSort(arr, pivotIndex+1, last);
        }    
    }
    
    // public quickSort calls private method but only takes in array 
    public static void quickSort(int arr[]) {
        quickSort(arr, 0, arr.length-1);
        

    }

    // repeated process for double
    public static void quickSort(double arr[]) {
        quickSort(arr, 0, arr.length-1);
        

    }

    // repeated process for string
    public static void quickSort(String arr[]) {
        quickSort(arr, 0, arr.length-1);
        

    }
}
