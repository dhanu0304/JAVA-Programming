import java.util.Scanner;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = s.nextDouble();

        Circle c = new Circle(r);

        System.out.println("Area of the circle: " + c.calculateArea());
        System.out.println("Circumference of the circle: " + c.calculateCircumference());

        s.close();
    }
}