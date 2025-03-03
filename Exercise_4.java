class MergeSort 
{ 
    /*
      Time Complexity: O(nlogn)

      Space Complexity: O(n)

      Did this code successfully run on Leetcode : Yes
      Any problem you faced while coding this : No
    */

    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void merge(int arr[], int l, int m, int r) {  
      int n1 = m - l + 1;
      int n2 = r - m;

      int left[] = new int[n1];
      int right[] = new int[n2];

      for (int i = 0; i < n1; ++i){
        left[i] = arr[l + i];
      }
         
      for (int j = 0; j < n2; ++j){
        right[j] = arr[m + 1 + j];
      }

      int i = 0, j = 0;

      int k = l;
      while (i < n1 && j < n2) {
          if (left[i] <= right[j]) {
              arr[k] = left[i];
              i++;
          }
          else {
              arr[k] = right[j];
              j++;
          }
          k++;
      }

      while (i < n1) {
          arr[k] = left[i];
          i++;
          k++;
      }

      while (j < n2) {
          arr[k] = right[j];
          j++;
          k++;
      }
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    void sort(int arr[], int l, int r) { 
      if (l < r) {
        int m =l+ (r-l)/2;

        sort(arr, l, m);
        sort(arr, m + 1, r);

        merge(arr, l, m, r);
    }
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
} 