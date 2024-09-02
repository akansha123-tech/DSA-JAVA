public class SelectionSort {
    static void sort(int[] a){
     int n = a.length;
     for(int i =0;i<n-1;i++){  // i represent current index value
       int min_index=i;  // finding min element index
        for(int j=i+1;j<n;j++){
            if(a[j]<a[min_index]){
                min_index=j;
           
            }
        }
        // swap cuurent element with min_index
        //a[min_index]==a[i]
        int temp=a[i];
        a[i]=a[min_index];
        a[min_index]=temp;
    }
    }
    
    public static void main(String[] args){
        int[] a = { 1,4,2,32,21,20,54,34,56};
        sort(a);
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+"  ");
        }
    }


}
