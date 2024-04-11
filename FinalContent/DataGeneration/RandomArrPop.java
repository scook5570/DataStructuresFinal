package FinalContent.DataGeneration;
import java.util.*;

public class RandomArrPop {
    Random rand = new Random();

    public int[] randIntArr(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }
        return arr;
    }

    public double[] randDoubleArr(int size) {
        double[] arr = new double[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble(10000);
        }

        return arr;
    }

    public String[] randStringArr(int size) {
        String[] arr = new String[size];
        for (int i = 0; i < arr.length; i++) {
            int temp = rand.nextInt(10000);
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
