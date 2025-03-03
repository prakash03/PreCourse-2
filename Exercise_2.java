class QuickSort 
{ 
    /*
      Time Complexity: Avg Case: O(nlogn), Worst case: O(n^2)

      Space Complexity: Avg Case: O(logn), worst case: O(n)

      Did this code successfully run on Leetcode : NA
      Any problem you faced while coding this : No
    */
    void swap(int arr[],int i,int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    
    int partition(int arr[], int low, int high) 
    { 
   	  //Write code here for Partition and Swap 
      int pivot = arr[high];
      int i = (low - 1);
  
      for(int j = low; j <= high - 1; j++)
      {
        if (arr[j] < pivot)
        {
          i++;
          swap(arr, i, j);
        }
      }
      swap(arr, i + 1, high);
      return (i + 1);
    }

    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(int arr[], int low, int high) {  
        if(low < high) {
          int partition_idx = partition(arr, low, high);
          sort(arr, low, partition_idx - 1);
          sort(arr, partition_idx + 1, high);
        }
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 
