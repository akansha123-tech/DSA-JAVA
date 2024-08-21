import java.util.Scanner;

public class Sumusingrecursion {
    static int Sum(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        } else {
            int small = Sum(n / 10);
            int last = n % 10;
            return small + last;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Sum of digits: " + Sum(number));
    }
}

