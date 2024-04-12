package FinalContent.DataGeneration;

import java.util.*;

public class RandomArrayGenerator {
    static Random random = new Random();

    public static int[] generateRandomIntArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
        }
        return arr;
    }

    public double[] generateRandomDoubleArray(int size, int min, int max) {
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = min + (max - min) * random.nextDouble();
        }

        return arr;
    }

    public String[] generateRandomStringArray(int size) {
        String[] arr = new String[size];
        for (int i = 0; i < arr.length; i++) {
            int temp = random.nextInt();
            arr[i] = Integer.toHexString(temp);
        }

        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArr(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
