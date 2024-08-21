public class Subsetsum {
    static void sum(int[]a , int n ,int idx,int sum){
        if(idx>=n){
            System.out.println(sum);
            return ;
        }
        sum(a, n, idx+1, sum);      //include
        sum(a, n, idx+1,sum+a[idx]);  //exclude
    
    }
    public static void main(String[] args) {
        int[] a ={2,4,5};
        sum(a,a.length,0,0);
            
      }

}
