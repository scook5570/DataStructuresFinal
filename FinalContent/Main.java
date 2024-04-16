package FinalContent;

import java.io.*;
import FinalContent.DataGeneration.*;
import FinalContent.sortAlgs.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Define array sizes to test
        int[] arraySizes = { 10, 100, 1000, 10000, 50000, 100000, 500000 }; //, 1000, 10000, 50000, 100000, 500000 
        // Define sorting algorithms to test
        String[] sortTypes = { "Selection", "Bubble", "Insertion", "Merge", "Quick", "Heap", "Shell", "Radix" };

        // Create instance of RandomArrayGenerator for generating random arrays
        RandomArrayGenerator randomArray = new RandomArrayGenerator();

        // Variable to store whether the array is sorted or unsorted
        String unsortSort;

        // FileWriter to write results to a file
        FileWriter results = new FileWriter("FinalContent/Results/results.txt");
        // Write header to file (csv format)
        results.write(String.format("Sort Type, Array Type, Array Size, Sorted/Unsorted, Nanoseconds%n"));
        
        // Loop through each array size
        for (int size : arraySizes) {
            // Generate random arrays for integers, doubles, and strings
            int[] intArray = randomArray.generateRandomIntArray(size, 0, size);
            double[] doubleArray = randomArray.generateRandomDoubleArray(size, 0, size);
            String[] stringArray = randomArray.generateRandomStringArray(size);

            // Store arrays before sorting for later use
            int[] intBefore = intArray;
            double[] doubleBefore = doubleArray;
            String[] stringBefore = stringArray;

            // Array containing all three types of arrays for iteration
            Object[] arrays = { intArray, doubleArray, stringArray };

            // Loop through each array type (int, double, string)
            for (Object array : arrays) { 
                // Loop through each sorting type
                for (String item : sortTypes) { 
                    // Loop through each sorting type twice, once unsorted then sorted
                    for (int i = 0; i < 2; i++) { 

                        // Determine if the array is sorted or unsorted
                        if (i == 0) {
                            unsortSort = "Unsorted";
                        } else {
                            unsortSort = "Sorted";
                        }

                        // Record start time for sorting
                        long start = System.nanoTime();

                        switch (item) {
                            case "Selection":
                                break;
                            case "Bubble":
                                if (array instanceof int[]) {
                                    Bubble.bubbleSort((int[]) array);
                                } else if (array instanceof double[]) {
                                    Bubble.bubbleSort((double[]) array);
                                } else if (array instanceof String[]) {
                                    Bubble.bubbleSort((String[]) array);
                                }
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
                                System.out.println("Error...");
                        }
                        // Record end time for sorting and calculate duration
                        long end = (System.nanoTime() - start);

                        System.out.println(item + " " + end);

                        // Write result to the file (csv format)
                        results.write(String.format("%s, %s], %d, %s, %d%n", item, array.getClass().getName(), size, unsortSort, end));
                    }

                    // Restore arrays to their original unsorted state for the next sorting algorithm
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
        results.close();
    }
}
