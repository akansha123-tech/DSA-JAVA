import java.util.*;
public class ReverseStringusingrecursion {
    static String reverse(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        String SmallAns=reverse(s, idx+1);
        return SmallAns+s.charAt(idx);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverse(s, 0));

    }
}
