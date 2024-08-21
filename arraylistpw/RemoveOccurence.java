import java.util.*;
public class RemoveOccurence {

    static String remove(String s,int idx){
        // base case
        if(idx==s.length())return "";
        // recursive case
        String smallans=remove(s, idx+1);
        char currchar=s.charAt(idx);
        // self case
        if(currchar!='a'){
            return currchar + smallans;
        }
        else{
            return smallans;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
         System.out.println(remove(s, 0));
    }
}
