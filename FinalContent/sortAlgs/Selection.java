package FinalContent.sortAlgs;
 
   import java.io.*;

public class FinalSelection {
    
        void sort(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
            {
                int minIndex = i;
                for (int j = i+1; j < n; j++)
                    if (arr[j] < arr[minIndex])
                        minIndex = j;

                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        void sort(double arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
            {
                int minIndex = i;
                for (int j = i+1; j < n; j++)
                    if (arr[j] < arr[minIndex])
                        minIndex = j;

                double temp = arr[minIndex];
                //change these 
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        void sort(String arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
            {
                int minIndex = i;
                for (int j = i+1; j < n; j++)
                    if (arr[j] < arr[minIndex])
                        minIndex = j;

                String temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

}
