package FinalContent.sortAlgs;

public class Bubble {
    public static void bubbleSort(int arr[]) { 
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) 
        // compares adjacent elements, swaps if in the wrong order  
        for (int j = 0; j < n - i - 1; j++) {
                
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j]; 
                arr[j] = arr[j + 1]; 
                arr[j + 1] = temp; 
            } 
        }
    } 

    public static void bubbleSort(double arr[]) { 
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) 
        // compares adjacent elements, swaps if in the wrong order  
        for (int j = 0; j < n - i - 1; j++) {
                
            if (arr[j] > arr[j + 1]) {
                double temp = arr[j]; 
                arr[j] = arr[j + 1]; 
                arr[j + 1] = temp; 
            } 
        }
    } 

    public static void bubbleSort(String arr[]) { 
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) 
        // compares adjacent elements, swaps if in the wrong order  
        for (int j = 0; j < n - i - 1; j++) {
                
            if (arr[j].compareTo(arr[j + 1]) > 0) {
                String temp = arr[j]; 
                arr[j] = arr[j + 1]; 
                arr[j + 1] = temp; 
            } 
        }
    }
  
    // Prints the array 
    public static void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
}
