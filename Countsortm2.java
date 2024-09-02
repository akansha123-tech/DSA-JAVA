public class Countsortm2 {
    static int  findMax(int[] arr){

      int mx = Integer.MIN_VALUE;
      for(int i  = 0 ; i < arr.length; i++){
        if(arr[i]>mx){
            mx= arr[i];
        }
      }
      return mx;
    }
    
    static void basicCountSort(int[] arr){

    // find largest element in array 
    int max=findMax(arr);
    int[] count  = new int[max+1];
    for(int i = 0 ; i<arr.length;i++){
       count[arr[i]]++;

    }
     int k = 0 ;
     for(int i = 0 ; i<count.length; i++){
        for(int j = 0 ; j<count[i]; j++){
            arr[k++]=i;
        }
     }

    }
    static void display(int[] a ){


        for (int val:a){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    static void countSort(int[] arr){
        int n = arr.length;
        int[] output= new int[n];
        int max=findMax(arr);
        int[] count  = new int[max+1];
        for(int i = 0 ; i<arr.length;i++){  // make  frequency array
         count[arr[i]]++;
        }
        // make prefix sum array of count array 

        for(int i = 1; i<count.length;i++){
            count[i]+=count[i-1];
        }

        // find index of each element in original arrray and put it in the output array
        for(int i = n-1; i>=0;i--){
         int idx=count[arr[i]]-1;
         output[idx]=arr[i];
         count[arr[i]]--;

        }
        // copy all elements output to arr
        for(int i = 0 ; i<n; i ++){
            arr[i]= output[i];
        }
   


    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,2,2,5};
        countSort(arr);
        display(arr);
    }
}