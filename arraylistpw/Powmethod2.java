public class Powmethod2 {
    static int pow(int p , int q){
        if(q==0){
            return 1;
        }
            int small=pow(p,q/2);
            if(q%2==0){
              return small*small;
            }
            return small*small*p;
        }
        public static void main(String[] args){
            System.out.println(pow(5, 4));
        }
    }
