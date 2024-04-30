package FinalContent.sortAlgs;
 
public class FinalHeap {
    public static void heap(int arr[], int N, int i){
    int minValue = i;
    int l = 2 * i + 1; 
    int r = 2 * i + 2;
    if(l < N && arr[l] < arr[minValue])
        minValue = l;
    if(r < N && arr[r] < arr[minValue])
        minValue = r; 
    if(minValue != i){
        int swap = arr[i];
        arr[i] = arr[minValue];
        arr[minValue] = swap;
        heap(arr, N, minValue);  
    }
    }
 static void constructHeap(int arr[], int N){
    int nodeIndex = (N/2) - 1;
    for(int i = nodeIndex; i >= 0; i-- ){
    heap(arr, N, i);
    }
  }
 
 public static void heap(double arr[], int N, int i){
        int minValue = i;
        int l = 2 * i + 1; 
        int r = 2 * i + 2;
        if(l < N && arr[l] < arr[minValue])
            minValue = l;
        if(r < N && arr[r] < arr[minValue])
            minValue = r; 
        if(minValue != i){
            double swap = arr[i];
            arr[i] = arr[minValue];
            arr[minValue] = swap;
            heap(arr, N, minValue);  
        }
        }
     static void constructHeap(double arr[], int N){
     int nodeIndex = (N/2) - 1;
     for(int i = nodeIndex; i >= 0; i-- ){
      heap(arr, N, i);
            }
          }

          public static void heap(String arr[], int N, int i){
            int minValue = i;
            int l = 2 * i + 1; 
            int r = 2 * i + 2;
            if(l < N && arr[l] < arr[minValue])
                minValue = l;
            if(r < N && arr[r] < arr[minValue])
                minValue = r; 
            if(minValue != i){
                String swap = arr[i];
                arr[i] = arr[minValue];
                arr[minValue] = swap;
                heap(arr, N, minValue);  
            }
            }
         static void constructHeap(String arr[], int N){
         int nodeIndex = (N/2) - 1;
         for(int i = nodeIndex; i >= 0; i-- ){
          heap(arr, N, i);
                }
              }



    

}
