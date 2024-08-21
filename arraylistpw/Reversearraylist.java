import java.util.ArrayList;
import java.util.Collections;

public class Reversearraylist{

        static void Reverselist (ArrayList<Integer> list){
         int i=0; int j=list.size()-1;
         while(i<j){
          Integer temp=Integer.valueOf(list.get(i));
          list.set(i,list.get(j));
          list.set(j,temp);
          i++;
          j--;

         }
        }
    public static void main(String[] args){
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(38);
        l1.add(48);
        l1.add(18);
        l1.add(23);
        l1.add(82);
        l1.add(1);
        System.out.println("original list" + l1);
        // Reverselist(l1);
        Collections.reverse(l1);
        System.out.println("reverse list"+l1);
    }
}