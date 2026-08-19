import java.util.Scanner;
class marks {
    public static void main(String[] args) {
    int marks;    
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the marks of the student: ");
    marks = s.nextInt();

   if (marks >= 85) {
    System.out.println("Distinction");
   } else if( marks>= 65) {
    System.out.println("Grade B");
   } else if (marks>= 45) 
    {System.out.println("Grade C");
   } else if (marks>=35) {
    System.out.println("Grade D");
   } else {
    System.out.println("FAIL");
   }
    s.close();
    }
}