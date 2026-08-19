import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, fact = 1;
        System.out.print("Enter a positive integer: ");
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial : " + fact);
        s.close();
    }
}

