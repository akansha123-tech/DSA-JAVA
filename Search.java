public class Search {
    static boolean search(int[] a,int n,int target,int idx){
        // base case
        if(idx>=n){
            return false;
        }
        if(a[idx]==target){
            return true;
        }
        return search(a, n,target,idx+1);
    }
    public static void main(String[] args) {
        int[] a={1,3,63,5};
        int target=4;
        if(search(a,target,a.length,0)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
    }
 
