package FinalContent.DataGeneration;

import java.util.*;

public class RandomArrayGenerator {
    static Random random = new Random();

    public int[] generateRandomIntArray(int size, int min, int max) {
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
        String lettersAndNumbers = "0123456789AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        String[] arr = new String[size];
        for (int i = 0; i < arr.length; i++) {
            String temp = "";
            for (int j = 0; j < random.nextInt(15) + 1; j++) {
                temp = temp.concat(String.valueOf(lettersAndNumbers.charAt(random.nextInt(lettersAndNumbers.length()))));
            }
            arr[i] = temp;
        }

        return arr;
    }

    public void printArr(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void printArr(double[] arr) {
        for (double item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void printArr(String[] arr) {
        for (String item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
