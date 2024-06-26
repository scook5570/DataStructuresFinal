package FinalContent;

import java.io.*;
import FinalContent.DataGeneration.*;
import FinalContent.sortAlgs.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Define array sizes to test
        int[] arraySizes = { 10, 100, 1000, 10000, 50000, 100000, 500000 };
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

        // Loop through three times so there are multiple tests for each array size and
        // type
        for (int i = 0; i < 3; i++) {
            // Loop through each array size
            for (int size : arraySizes) {
                // Generate random arrays for integers, doubles, and strings
                int[] intArray = randomArray.generateRandomIntArray(size, 0, 10000, i);
                double[] doubleArray = randomArray.generateRandomDoubleArray(size, 0, 10000, i);
                String[] stringArray = randomArray.generateRandomStringArray(size, i);

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
                        for (int u = 0; u < 2; u++) {

                            // Determine if the array is sorted or unsorted
                            if (u == 0) {
                                unsortSort = "Unsorted";
                            } else {
                                unsortSort = "Sorted";
                            }

                            // Record start time for sorting
                            long start = System.nanoTime();

                            switch (item) {
                                case "Selection":
                                     if (array instanceof int[]) {
                                        Selection.selectionSort((int[]) array);
                                    } else if (array instanceof double[]) {
                                        Selection.selectionSort((double[]) array);
                                    } else if (array instanceof String[]) {
                                        Selection.selectionSort((String[]) array);
                                    }
                                    break;
                                case "Bubble": // this one will take like 15 minutes at 500000 😵
                                    if (array instanceof int[]) {
                                        Bubble.bubbleSort((int[]) array);
                                    } else if (array instanceof double[]) {
                                        Bubble.bubbleSort((double[]) array);
                                    } else if (array instanceof String[]) {
                                        Bubble.bubbleSort((String[]) array);
                                    }
                                    break;
                                case "Insertion":
                                    if (array instanceof int[]) {
                                        Insertion.insertionSort((int[]) array);
                                    } else if (array instanceof double[]) {
                                        Insertion.insertionSort((double[]) array);
                                    } else if (array instanceof String[]) {
                                        Insertion.insertionSort((String[]) array);
                                    }
                                    break;
                                case "Merge":
                                     if (array instanceof int[]) {
                                        Merge.mergeSort((int[]) array);
                                    } else if (array instanceof double[]) {
                                        Merge.mergeSort((double[]) array);
                                    } else if (array instanceof String[]) {
                                        Merge.mergeSort((String[]) array);
                                    }
                                    break;
                                case "Quick":
                                    if (array instanceof int[]) {
                                        Quick.quickSort((int[]) array);
                                    } else if (array instanceof double[]) {
                                        Quick.quickSort((double[]) array);
                                    } else if (array instanceof String[]) {
                                        Quick.quickSort((String[]) array);
                                    }

                                    break;
                                case "Heap":
                                     if (array instanceof int[]) {
                                        Heap.heapSort((int[]) array);
                                    } else if (array instanceof double[]) {
                                        Heap.heapSort((double[]) array);
                                    } else if (array instanceof String[]) {
                                        Heap.heapSort((String[]) array);
                                    }
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
                                    break;
                            }
                            // Record end time for sorting and calculate duration
                            long time = (System.nanoTime() - start);

                            if (item.equals("Radix") || item.equals("Shell"))
                                System.out.println(item + " " + size + " " + time);
                            // Write result to the file (csv format)
                            results.write(String.format("%s, %s], %d, %s, %d%n", item, array.getClass().getName(), size,
                                    unsortSort, (time - 850))); // - 850 accounts for average switch-case overhead
                        }

                        // Restore arrays to their original unsorted state for the next sorting
                        // algorithm
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
        results.close();
    }
}
