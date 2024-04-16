package FinalContent.sortAlgs;

public class Insertion {
    
    //insertion sort for array of integers
    public static void insertionSort(int arr[]) {
        int len = arr.length;
        // starting i and 1 and j at 0 to compare 
        for (int i = 1; i < len; i++){
            int key = arr[i];
            int j = i-1;

            // while loop to swap adjacent elements if the previous is greater than the current 
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
            }

            arr[j+1] = key;
        }
    }

    // repeated process for double
    public static void insertionSort(double arr[]) {
        int len = arr.length;
        for (int i = 1; i < len; i++){
            double key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
            }

            arr[j+1] = key;
        }
    }

    // repeated process for string
    public static void insertionSort(String arr[]) {
        int len = arr.length;
        for (int i = 1; i < len; i++){
            String key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j+1] = arr[j];
                j = j-1;
            }

            arr[j+1] = key;
        }
    }
}
