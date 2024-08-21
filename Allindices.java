public class Allindices {
    static void allindices(int[] a,int n,int target,int idx){
          if(idx>=n){
            return;
          }
          if(a[idx]==target){
            System.out.println(idx);
          }
          allindices(a,n,target,idx+1);
    }
    public static void main(String[] args) {
        int[] a ={1,3,4,5,4,4,7};
        int target=4;
        int n = 7;
        allindices(a, n, target, 0);
    }
}
