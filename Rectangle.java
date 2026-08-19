import java.util.Scanner;
public class Rectangle {
    double l,b;

     Rectangle(double length, double width) {
        this.l = length;
        this.b = width;
    }
    
    double calculateArea() {
        return l * b;
    }

    double calculatePerimeter() {
        return 2 * (l + b);
    }
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = s.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = s.nextDouble();

        Rectangle r = new Rectangle(length, width);

        System.out.println("Area of the rectangle: " + r.calculateArea());
        System.out.println("Perimeter of the rectangle: " + r.calculatePerimeter());

        s.close();
    }
}


