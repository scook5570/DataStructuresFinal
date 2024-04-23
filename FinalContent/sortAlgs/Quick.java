package FinalContent.sortAlgs;

public class Quick {
    
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
    

    private static void quickSort(int arr[], int first, int last) {
        if (first < last) {
            int pivotIndex = divide(arr, first, last);
            quickSort(arr, first, pivotIndex-1);
            quickSort(arr, pivotIndex+1, last);
        }    
    }
    
    public static void quickSort(int arr[]) {
        quickSort(arr, arr[0], arr.length-1);
        

    }
}
