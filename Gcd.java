
import java.util.Scanner;

public class Gcd {
    static int hcf(int x,int y){
       if(y==0){
        return x;
       } 
       return hcf(y,x%y);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(hcf(x,y));
    }
}
