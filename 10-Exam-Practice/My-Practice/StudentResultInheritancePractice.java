import java.util.Scanner;

class Person {
    String name;
    int age;
}

class Student extends Person {
    int rollNo;
    String course;
}

class Result extends Student {
    int m1, m2, m3;
    int total;
    double percentage;
    String grade;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course: ");
        course = sc.nextLine();

        System.out.print("Enter marks 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter marks 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter marks 3: ");
        m3 = sc.nextInt();
    }

    void calculate() {
        total = m1 + m2 + m3;
        percentage = total / 3.0;

        if (percentage >= 80)
            grade = "A";
        else if (percentage >= 60)
            grade = "B";
        else if (percentage >= 40)
            grade = "C";
        else
            grade = "Fail";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Result r = new Result();

        r.input();
        r.calculate();
        r.display();
    }
}