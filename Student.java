class Student {
    int rollNo;
    String name;
    float marks;

    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rollNo = 101;
        s1.name = "Rahul";
        s1.marks = 88.5f;

        s2.rollNo = 102;
        s2.name = "Raj";
        s2.marks = 69.5f;

        s3.rollNo = 103;
        s3.name = "John";
        s3.marks = 92.0f;

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
