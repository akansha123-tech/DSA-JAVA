public class KeypadCombinations {
    static void combinations(String dig,String[] kp, String res){
        if(dig.length()==0){
            System.out.println(res+"");
            return;
        }
        int currNum=dig.charAt(0)-'0';   //2
        String currChoices=kp[currNum];//"abc"
       for(int i =0;i<currChoices.length();i++){//"abc"
        combinations(dig.substring(1), kp, res+currChoices.charAt(i));
       }
    }
    public static void main(String[] args) {
        String dig="23";
        // kp[s]="pqrs"
        String[] kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}
    }
}
