public class Power {
    static int pow(int p,int q ){
        if(q==0){
            return 1;
        }
        int small=pow(p,q-1);
        return small*p;
    }
    public static void main(String[] args){
        System.out.println(pow(5, 4));
    }
}
