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

            int[] intBefore = intArray;
            double[] doubleBefore = doubleArray;
            String[] stringBefore = stringArray;

            Object[] arrays = { intArray, doubleArray, stringArray };

            for (Object array : arrays) { // test each array type
                for (String item : sortTypes) { // test each sorting type
                    for (int i = 0; i < 2; i++) { // loop through each sorting type again with sorted array
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
                                if (array instanceof int[]) {
                                    Shell.shellSort((int[]) array);
                                } else if (array instanceof double[]) {
                                    Shell.shellSort((double[]) array);
                                } else if (array instanceof String[]) {
                                    Shell.shellSort((String[]) array);
                                }
                                break;
                            case "Radix":
                                if (array instanceof int[]) {
                                    Radix.radixSort((int[]) array);
                                } else if (array instanceof double[]) {
                                    Radix.radixSort((double[]) array); 
                                } else if (array instanceof String[]) {
                                    Radix.radixSort((String[]) array);
                                }
                                break;
                            default:
                                System.out.println("Error.");
                        }
                        String unsortSort;
                        if (i == 0) {
                            unsortSort = "Unsorted";
                        }  else {
                            unsortSort = "Sorted";
                        }
                            System.out.format("%9s, %6d, %19s], %8s, %10d \n", item, size, array.getClass().getName(), unsortSort, (System.nanoTime() - start));
                            // System.out.println(item + " [size " + size +  " / " + array.getClass().getName() + " / unsorted]: " + (System.nanoTime() - start));
                    }

                    if (array instanceof int[]) {
                        array = intBefore;
                    } else if (array instanceof double[]) {
                        array = doubleBefore; 
                    } else if (array instanceof String[]) {
                        array = stringBefore;
                    }
                } 
            }
        }
    }
}
