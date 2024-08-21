public class Printsubsequencemain {
    static void printSSQ(String s , String currAns){ //s="abc" ,currans=""
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr=s.charAt(0);  // a
        String remString=s.substring(1);  //bc

        //curr char--> chooses to be a part of curr ans  

        printSSQ(remString, currAns+curr);

        //curr char--> chooses to be a part of curr ans

        printSSQ(remString, currAns);

    }
     public static void main(String[] args){
        printSSQ("abc","");
    }
}
