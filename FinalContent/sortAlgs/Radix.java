package FinalContent.sortAlgs;

public class Radix {
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double getMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static String getMax(String[] arr) {
        String max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > max.length()) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void countNumbers(int[] arr, int place) {
        int[] output = new int[arr.length];
        int[] tally = new int[10];

        for (int i = 0; i < tally.length; i++) {
            tally[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            tally[(arr[i] / place) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            tally[i] += tally[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[tally[(arr[i] / place) % 10] - 1] = arr[i];
            tally[(arr[i] / place) % 10]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void countNumbers(double[] arr, double place) {
        double[] output = new double[arr.length];
        int[] tally = new int[10];

        for (int i = 0; i < tally.length; i++) {
            tally[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            tally[(int)(arr[i] / place) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            tally[i] += tally[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[tally[(int)(arr[i] / place) % 10] - 1] = arr[i];
            tally[(int)(arr[i] / place) % 10]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void countNumbers(String[] arr, int place) {
        // place starts at 9 then 8...
        String[] output = new String[arr.length];
        int[] tally = new int[36]; // capital letters do not take priority: 0 to 9 and a to z

        for (int i = 0; i < tally.length; i++) {
            tally[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].length() > place) {
                tally[findVal(arr[i].charAt(place))]++;
            } else {tally[0]++;}
        }

        for (int i = 1; i < 36; i++) {
            tally[i] += tally[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != null && arr[i].length() > place) {
                output[tally[findVal(arr[i].charAt(place))] - 1] = arr[i];
                tally[findVal(arr[i].charAt(place))]--;
            } else {
                output[tally[0] - 1] = arr[i];
                tally[0]--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static int findVal(char letter) {
        String lettersAndNumbers = "0123456789abcdefghijklmnopqrstuvwxyz";
        int index = 0;
        while (Character.toLowerCase(letter) != lettersAndNumbers.charAt(index)) {
            index++;
        }
        return index;
    }
    
    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        for (int place = 1; max / place > 0; place *= 10) {
            countNumbers(arr, place);
        }
    }

    public static void radixSort(double[] arr) {
        double max = getMax(arr);

        for (double place = 0.00000000000001; max / place > 0.000000000000001; place *= 10) { 
            countNumbers(arr, place);
        }
    }

    public static void radixSort(String[] arr) {
        String max = getMax(arr);

        for (int place = max.length() - 1; place >= 0; place--) {
            countNumbers(arr, place);
        }
    }
}
