import java.util.*;
public class PalendromeRecursion{
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
        String rev=reverse(s, 0);
        if(rev.equals(s)){
            System.out.printf("%s is palendrome",s);

        }
        else{
            System.out.printf("%s is not palendrome", s);
        }
    }
}
