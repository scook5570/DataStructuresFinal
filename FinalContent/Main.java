package FinalContent;

import FinalContent.DataGeneration.*;
import FinalContent.sortAlgs.*;

public class Main {
    public static void main(String args[]) {
        int[] arraySizes = { 10, 100, 1000, 10000, 50000, 100000, 500000 };
        String[] sortTypes = { "Selection", "Bubble", "Insertion", "Merge", "Quick", "Heap", "Shell", "Radix" };
        RandomArrayGenerator randomArray = new RandomArrayGenerator();

        for (int size : arraySizes) {
            int[] intArray = randomArray.generateRandomIntArray(size, 0, size);
            double[] doubleArray = randomArray.generateRandomDoubleArray(size, 0, size);
            String[] stringArray = randomArray.generateRandomStringArray(size);

            Object[] arrays = { intArray, doubleArray, stringArray };

            for (Object array : arrays) {
                for (String item : sortTypes) {
                    long start = System.nanoTime();
                    switch (item) {
                        case "Selection":
                            System.out.println("Selection");
                        case "Bubble":
                            System.out.println("Bubble");
                        case "Insertion":
                            System.out.println("Insertion");
                        case "Merge":
                            System.out.println("Merge");
                        case "Quick":
                            System.out.println("Quick");
                    }
                    System.out.println(System.nanoTime() - start);
                }
            }

            // long start = System.nanoTime();
            // Radix.radixSort(intArray);
            // long end = System.nanoTime();

        }
    }
}
