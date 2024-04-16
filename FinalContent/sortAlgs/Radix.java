package FinalContent.sortAlgs;

public class Radix {

    /**
     * Find the largest integer in the array.
     * @param arr - the array of integers
     * @return the maximum value in the array
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max value if a greater value is found
            }
        }
        return max;
    }

    /**
     * Find the largest double in the array.
     * @param arr - the array of doubles
     * @return the maximum value in the array
     */
    public static double getMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max value if a greater value is found
            }
        }
        return max;
    }

    /**
     * Find the longest string in the array.
     * @param arr - the array of strings
     * @return the longest string in the array
     */
    public static String getMax(String[] arr) {
        String max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > max.length()) { // Compare lengths of strings
                max = arr[i]; // Update max string if a longer one is found
            }
        }
        return max;
    }

    /**
     * Perform counting sort on an array of integers based on the specified place.
     * @param arr - the array of integers
     * @param place - the place value (e.g., ones, tens, hundreds)
     */
    public static void countNumbers(int[] arr, int place) {
        int[] output = new int[arr.length];
        int[] tally = new int[10]; // Array to store counts of digits (0-9)

        // Initialize tally array with zeros
        for (int i = 0; i < tally.length; i++) {
            tally[i] = 0;
        }

        // Count occurrences of digits at the specified place
        for (int i = 0; i < arr.length; i++) {
            tally[(arr[i] / place) % 10]++; // Increment tally for each digit
        }

        // Adjust tally to represent actual positions in the output array
        for (int i = 1; i < 10; i++) {
            tally[i] += tally[i - 1];
        }

        // Build output array according to the sorted order
        for (int i = arr.length - 1; i >= 0; i--) {
            output[tally[(arr[i] / place) % 10] - 1] = arr[i];
            tally[(arr[i] / place) % 10]--;
        }

        // Update input array with the sorted values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    /**
     * Perform counting sort on an array of doubles based on the specified place.
     * @param arr - the array of doubles
     * @param place - the place value (e.g., 0.1, 0.01, 0.001)
     */
    public static void countNumbers(double[] arr, double place) {
        double[] output = new double[arr.length];
        int[] tally = new int[10]; // Array to store counts of digits (0-9)

        // Initialize tally array with zeros
        for (int i = 0; i < tally.length; i++) {
            tally[i] = 0;
        }

        // Count occurrences of digits at the specified place
        for (int i = 0; i < arr.length; i++) {
            tally[(int)(arr[i] / place) % 10]++; // Increment tally for each digit
        }

        // Adjust tally to represent actual positions in the output array
        for (int i = 1; i < 10; i++) {
            tally[i] += tally[i - 1];
        }

        // Build output array according to the sorted order
        for (int i = arr.length - 1; i >= 0; i--) {
            output[tally[(int)(arr[i] / place) % 10] - 1] = arr[i];
            tally[(int)(arr[i] / place) % 10]--;
        }

        // Update input array with the sorted values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    /**
     * Perform counting sort on an array of strings based on the specified character place.
     * @param arr - the array of strings
     * @param place - the character index (rightmost to leftmost)
     */
    public static void countNumbers(String[] arr, int place) {
        String[] output = new String[arr.length];
        int[] tally = new int[36]; // Array to store counts of characters (0-9, a-z)

        // Initialize tally array with zeros
        for (int i = 0; i < tally.length; i++) {
            tally[i] = 0;
        }

        // Count occurrences of characters at the specified place
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].length() > place) {
                tally[findVal(arr[i].charAt(place))]++; // Increment tally for each character
            } else {
                tally[0]++; // Buffer with zeros for shorter strings
            }
        }

        // Adjust tally to represent actual positions in the output array
        for (int i = 1; i < 36; i++) {
            tally[i] += tally[i - 1];
        }

        // Build output array according to the sorted order
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != null && arr[i].length() > place) {
                output[tally[findVal(arr[i].charAt(place))] - 1] = arr[i];
                tally[findVal(arr[i].charAt(place))]--; // Decrement tally after placing string
            } else {
                output[tally[0] - 1] = arr[i];
                tally[0]--;
            }
        }

        // Update input array with the sorted values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    /**
     * Find the index of a character in the string containing numbers and lowercase letters.
     * @param letter - the character to find
     * @return the index of the character
     */
    public static int findVal(char letter) {
        String lettersAndNumbers = "0123456789abcdefghijklmnopqrstuvwxyz";
        int index = 0;
        while (Character.toLowerCase(letter) != lettersAndNumbers.charAt(index))
 {
            index++;
        }
        return index;
    }
    
    // find the largest int and iterate through 1s, 10s, 100s... right to left, calling countNumbers
    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        // starts at rightmost place
        for (int place = 1; max / place > 0; place *= 10) {
            countNumbers(arr, place);
        }
    }

    // find the largest double and iterate through 0.001s, 0.01s, and the like, right to left, calling countNumbers
    public static void radixSort(double[] arr) {
        double max = getMax(arr);

        // starts at smallest possible place for double
        for (double place = 0.00000000000001; max / place > 0.000000000000001; place *= 10) { 
            countNumbers(arr, place);
        }
    }

    // find the longest String and iterate through each place, right to left
    public static void radixSort(String[] arr) {
        String max = getMax(arr);

        // starts at right most char
        for (int place = max.length() - 1; place >= 0; place--) {
            countNumbers(arr, place);
        }
    }
}
