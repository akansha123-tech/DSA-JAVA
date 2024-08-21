import java.util.ArrayList;
public class Subsequences {
// s="abc"

    static ArrayList<String> getSSQ(String s){
    ArrayList<String> ans=new ArrayList<>();
    // base case
    if(s.length()==0){
        ans.add("");
        return ans;
    }
    char curr=s.charAt(0);
     ArrayList<String> smallans=getSSQ(s.substring(1));    
    // s={'bc' 'b' 'c ' ""}

    // final ans =// s={'bc' 'b' 'c ' ""}+{'abc' 'ab' 'ac ' "a"}

    // small ans s={'bc' 'b' 'c ' ""}
    //  ans s={'bc','abc','b','ab','c','ac',  "",a}
    for(String ss:smallans){
        ans.add(ss);   //bc
        ans.add(curr+ss);

    }

   return ans;
}
public static void main(String[] args) {
    ArrayList<String> ans= getSSQ("abc");
    for(String ss: ans){
        System.out.println(ss);
    }
}

}
