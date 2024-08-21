public class Maxarrayrecursion {
    static int maxarray(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        // small pproblem-->idx+1,end of array->max-->return ans
        int smallAns=maxarray(arr, idx+1);


        // selfwork and final ans
        return Math.max(arr[idx],smallAns);
        
    }
    public static void main(String[] args){
      int [] arr = {34,5,6,89,1,10};
      System.out.println(maxarray(arr, 0));
    }
}
