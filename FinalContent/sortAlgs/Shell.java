package FinalContent.sortAlgs;

public class Shell {
    /**
     * Shell sort implementation for integer arrays.
     * 
     * @param arr
     */
    public static void shellSort(int[] arr) {
        // Start with a large gap and then reduce at each interval
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // Perform insertion sort for the elements at the gap intervals
            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i]; // Store the current element as temp

                // Shift elements until correct index for temp is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                arr[j] = temp; // Place temp at new location
            }
        }
    }

    /**
     * Shell sort implementation for double arrays.
     * 
     * @param arr
     */
    public static void shellSort(double[] arr) {
        // Start with a large gap and then reduce at each interval
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // Perform insertion sort for the elements at the gap intervals
            for (int i = gap; i < arr.length; i++) {
                double temp = arr[i]; // Store current element as temp

                // Shift elements until correct index for temp is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                arr[j] = temp; // Place temp at new location
            }
        }
    }

    /**
     * Shell sort implementation for String arrays.
     * 
     * @param arr
     */
    public static void shellSort(String[] arr) {
        // Start with a large gap and then reduce at each interval
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // Perform insertion sort for the elements at the gap intervals
            for (int i = gap; i < arr.length; i++) {
                String temp = arr[i]; // Store current element as temp

                // Shift elements until correct index for temp is found, compare as lowercase
                // Swapping > to < will give Z-A
                int j;
                for (j = i; j >= gap && arr[j - gap].toLowerCase().compareTo(temp.toLowerCase()) > 0; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                arr[j] = temp; // Place temp at new location
            }
        }
    }
}
