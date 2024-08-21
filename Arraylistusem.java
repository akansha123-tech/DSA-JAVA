import java.util.ArrayList;

public class Arraylistusem {
    static ArrayList<Integer> allindices(int[] a,int n , int target,int idx){
        ArrayList<Integer> ans =new ArrayList<>();
        if(idx>=n){
            return ans;
        }
        
        if(a[idx]==target){
            ans.add(idx);

        }
        ArrayList<Integer> smallans=allindices(a, n, target, idx+1);
       ans.addAll(smallans);
       return ans;
    }
    public static void main(String[] args) {
        int[] a= { 1,2,6,3,2,2,2,5};
        int n =a.length;
        int target=2;
        ArrayList<Integer> ans=allindices(a, n, target, 0);
        for(Integer i : ans){
            System.out.println(i);
        }   
    }
}
