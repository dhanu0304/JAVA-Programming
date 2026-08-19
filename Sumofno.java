import java.util.Scanner;

class Sumofno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,j, sum = 0;

        System.out.print("Enter first positive integer: ");
        i = s.nextInt();

        System.out.print("Enter second positive integer: ");
        j = s.nextInt();
        
        sum= i+j;

        System.out.println("Sum: " + sum);
        s.close();
    }
}