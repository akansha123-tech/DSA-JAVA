import java.util.ArrayList;
import java.util.Collections;
public class Bucketsort {
     static void bucketSort(float[] arr){
      // buckets
      int n = arr.length;
//      int[] a = new int[5];
      ArrayList<Float>[] buckets=new ArrayList[n];
      // create empty buckets
      for(int i =0 ;i<n;i++){
        buckets[i]=new ArrayList<Float>();

      }
      // add array elements into bucket
      for(int i =0 ;i<n;i++){
        int bucketindex=(int) arr[i]*n;
        buckets[bucketindex].add(arr[i]);

      }
      // sort each buket individually
    for(int i = 0; i< buckets.length;i++){
        Collections.sort(buckets[i]);

    }
    // merge all buckets to find final sorted array 
    int index= 0;
    for(int i =0 ; i< buckets.length;i++){
        ArrayList<Float> currbucket=buckets[i];
        for(int j =0 ;j< currbucket.size();j++){
           arr[index++]= currbucket.get(j);

        }
    }

     }
     public static void main(String[] args){
        float[] arr = {0.5f,0.4f,0.3f,0.2f,0.1f};
        bucketSort(arr);
        for(float val: arr){
            System.out.print(val+" ");
        }
        System.out.println();
     }
}
