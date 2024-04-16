package FinalContent.sortAlgs;

public class Bubble {
    void bubbleSort(int arr[]) { 
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) //Each Round, if n elements then n rounds
            for (int j = 0; j < n - i - 1; j++) // Compare adjacent elements
                if (arr[j] > arr[j + 1]) { //elements are in the wrong order
                    // swap temp and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
    } 
  
    // Prints the array 
    void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) { 
        Bubble ob = new Bubble(); 
        int arr[] = { 54, 23, 65, 12, 32, 17, 49, 61 }; //example elements in unsorted order
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    } 
}

