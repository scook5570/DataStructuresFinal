package FinalContent.sortAlgs;

public class Bubble {
    public void bubbleSort(int arr[]) { 
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
  
    // Prints the array 
    public void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
 // temporary main to test; will remove later
    public static void main(String args[]) { 
        Bubble ob = new Bubble(); 
        // temporary arr to sort
        int arr[] = { 54, 23, 65, 12, 32, 17, 49, 61 }; 
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    } 
}

