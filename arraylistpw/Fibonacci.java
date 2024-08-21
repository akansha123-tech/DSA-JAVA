import java.util.Scanner;
public class Fibonacci {
    static  int fib(int n){

          if(n==0||n==1){
            return n;
          }
          return fib(n-1)+fib(n-2);


        // int prev=fib(n-1);
        // int prevPrev=fib(n-2);
        // return prev+prevPrev;
    }
    public static void main(String[] args){
        for(int  i =0;i<=5;i++){

        
        System.out.println(fib(i));
    }
}
}
