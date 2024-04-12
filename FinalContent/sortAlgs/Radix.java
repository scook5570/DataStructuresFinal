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
            if (arr[i].compareTo(max) < 0) {
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

    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        for (int place = 1; max / place > 0; place *= 10) {
            countNumbers(arr, place);
        }
    }

}
