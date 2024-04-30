package FinalContent.DataGeneration;

import java.util.*;

public class RandomArrayGenerator {
    static Random random; // Static variable to generate random numbers

    // Method to generate an array of random integers
    public int[] generateRandomIntArray(int size, int min, int max, int seed) {
        int[] arr = new int[size]; // Create an array of integers with the specified size
        random = new Random(seed); // Initialize the random number generator with the given seed
        for (int i = 0; i < size; i++) {
            // Generate random integer within the specified range and assign it to the array
            arr[i] = random.nextInt(max - min + 1) + min;
        }
        return arr; // Return the generated array
    }

    // Method to generate an array of random doubles
    public double[] generateRandomDoubleArray(int size, int min, int max, int seed) {
        double[] arr = new double[size]; // Create an array of doubles with the specified size
        random = new Random(seed); // Initialize the random number generator with the given seed
        for (int i = 0; i < size; i++) {
            // Generate random double within the specified range and assign it to the array
            arr[i] = min + (max - min) * random.nextDouble();
        }
        return arr; // Return the generated array
    }

    // Method to generate an array of random strings
    public String[] generateRandomStringArray(int size, int seed) {
        String lettersAndNumbers = "0123456789AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        String[] arr = new String[size]; // Create an array of strings with the specified size
        random = new Random(seed); // Initialize the random number generator with the given seed
        for (int i = 0; i < arr.length; i++) {
            String temp = "";
            // Generate a random string of length between 1 and 15 characters
            for (int j = 0; j < random.nextInt(15) + 1; j++) {
                // Append random characters from the lettersAndNumbers string to form the random
                // string
                temp = temp
                        .concat(String.valueOf(lettersAndNumbers.charAt(random.nextInt(lettersAndNumbers.length()))));
            }
            arr[i] = temp; // Assign the generated string to the array
        }
        return arr; // Return the generated array
    }

    // Method to print an array of integers
    public void printArr(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " "); // Print each element of the array followed by a space
        }
        System.out.println(); // Move to the next line after printing the array
    }

    // Method to print an array of doubles
    public void printArr(double[] arr) {
        for (double item : arr) {
            System.out.print(item + " "); // Print each element of the array followed by a space
        }
        System.out.println(); // Move to the next line after printing the array
    }

    // Method to print an array of strings
    public void printArr(String[] arr) {
        for (String item : arr) {
            System.out.print(item + " "); // Print each element of the array followed by a space
        }
        System.out.println(); // Move to the next line after printing the array
    }
}
