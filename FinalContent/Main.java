package FinalContent;

import FinalContent.DataGeneration.*;
import FinalContent.sortAlgs.*;

public class Main {
    public static void main(String args[]) {
        int[] arraySizes = { 10, 100 };
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
                            break;
                        case "Bubble":
                            break;
                        case "Insertion":
                            break;
                        case "Merge":
                            break;
                        case "Quick":
                            break;
                        case "Heap":
                            break;
                        case "Shell":
                            break;
                        case "Radix":
                            if (array instanceof int[]) {
                                Radix.radixSort((int[]) array);
                                for (int number : (int[])array) {
                                    System.out.println(number + " ");
                                }
                            } else if (array instanceof double[]) {
                                Radix.radixSort((double[]) array); // broken :(
                                for (double number : (double[])array) { 
                                    System.out.println(number + " ");
                                }
                            } else if (array instanceof String[]) {
                                Radix.radixSort((String[]) array); // broken fix it later
                                for (String string : (String[])array) {
                                    System.out.println(string + " ");
                                }
                            }
                            break;
                        default:
                            System.out.println("Error.");
                    }
                    System.out.println(System.nanoTime() - start);
                }
            }
        }
    }
}
