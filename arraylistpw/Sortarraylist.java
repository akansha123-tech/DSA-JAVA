import java.util.ArrayList;
import java.util.Collections;
public class Sortarraylist{
    static void Sort  (ArrayList<Integer> list){
     
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(38);
        l1.add(48);
        l1.add(18);
        l1.add(23);
        l1.add(82);
        l1.add(1);
        System.out.println("original list" + l1);
        // sortlist(l1);

        // Collections.reverseOrder() this is for sort in reverse order
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("sort list"+l1);

        // sorting strings
        ArrayList<String> s1=new ArrayList<>();
        s1.add("welcome ");
        s1.add("to ");
        s1.add("world");
        s1.add("of ");
        s1.add("Akansha ");
         System.out.println("original strings"+s1);
         Collections.sort(s1);
         Collections.sort(s1,Collections.reverseOrder());
         System.out.println("sorted order"+s1);
    }
    }

