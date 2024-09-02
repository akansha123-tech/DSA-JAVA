// public class QuickSort {

//     static void displayArr(int[] arr){    // display method to diplay array 
//         for(int val : arr){
//             System.out.println(val+" ");
//         }
//     }
//     static void Swap(int[]arr, int x,int y){   // swap method to swap the array 
//         int temp = arr[x];
//         arr[x]=arr[y];
//         arr[y]=temp;
//        }
//        static int partition(int[] arr,int st_idx,int end_idx){
//         int pivot=arr[st_idx];
//         int cnt=0;
//         for(int i = st_idx;i<=end_idx;i++){
//             if(arr[i]<=pivot)cnt++;
//         } 
//         int pivotidx=st_idx+cnt;
//         Swap(arr,st_idx,pivotidx);
//         int i = st_idx,j=end_idx;
//         // element lesser or equal left of pivotidx,greater-->right side of pivotidx
//         while(i<pivotidx  && j >pivotidx){
//             while(arr[i]<= pivot) i++;
//             while(arr[j]>pivot) j--;
            
//             if(i<pivotidx &&  j>pivotidx){
//                 Swap(arr,i,j );
//                 i++;
//                 j--;
//             }
//         }
//         return pivotidx;
//        }
//        // implementation o f quick sort 
//     static void quickSort(int[] arr ,  int st_idx , int end_idx){
//         if(st_idx>=end_idx){
//             return ; 
//         }
//         int p_index=partition(arr,st_idx,end_idx);
//         quickSort(arr, st_idx, p_index-1);
//         quickSort(arr,p_index+1, end_idx);

//     }


//  public static void main(String[] args){
//     int[] arr={6,3,1,5,4};
//     System.out.println("Array before sorting ");
//     displayArr(arr);
//     quickSort(arr, 0,arr.length-1);

//     System.out.println();
//     System.out.println("Array after sorting");
//     displayArr(arr); // 1 3 4 5 6
//  }
//  }
public class QuickSort {

    static void displayArr(int[] arr) { // Display method to display array
        for (int val : arr) {
            System.out.print(val + " "); // Corrected: Use print for proper formatting
        }
        System.out.println(); // Corrected: Add newline after printing the array
    }

    static void swap(int[] arr, int x, int y) { // Swap method to swap the array elements
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int st_idx, int end_idx) {
        int pivot = arr[st_idx]; // Choose pivot as the first element
        int cnt = 0;

        // Corrected: Count elements less than or equal to pivot starting from st_idx + 1
        for (int i = st_idx + 1; i <= end_idx; i++) { 
            if (arr[i] <= pivot) cnt++; // Corrected: Count elements less than or equal to pivot
        }

        int pivotidx = st_idx + cnt; // Corrected: Calculate final position of pivot
        swap(arr, st_idx, pivotidx); // Corrected: Swap pivot to its correct position

        int i = st_idx, j = end_idx;

        // Corrected: Elements less than or equal to pivot on left, greater on right
        while (i < pivotidx && j > pivotidx) {
            while (arr[i] <= pivot) i++; // Corrected: Find element greater than pivot
            while (arr[j] > pivot) j--;  // Corrected: Find element less than or equal to pivot

            if (i < pivotidx && j > pivotidx) {
                swap(arr, i, j); // Corrected: Swap out-of-place elements
                i++;
                j--;
            }
        }
        return pivotidx; // Corrected: Return the pivot index
    }

    static void quickSort(int[] arr, int st_idx, int end_idx) {
        if (st_idx >= end_idx) {
            return; // Base case: if the subarray has 1 or no elements
        }
        int p_index = partition(arr, st_idx, end_idx); // Partition the array
        quickSort(arr, st_idx, p_index - 1); // Recursively sort left subarray
        quickSort(arr, p_index + 1, end_idx); // Recursively sort right subarray
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 5, 4};
        System.out.println("Array before sorting:");
        displayArr(arr); // Display the unsorted array
        quickSort(arr, 0, arr.length - 1); // Corrected: Sort the array
        System.out.println("Array after sorting:");
        displayArr(arr); // Display the sorted array
    }
}

    

