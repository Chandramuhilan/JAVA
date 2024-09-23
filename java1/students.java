
 import java.util.Scanner;

interface StudentInfo {
    void displayDetails();
    void checkPassFail();
}

class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayBasicInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class StudentMarks extends Student implements StudentInfo {
    int[] marks;  
    String[] subjects;  

    public StudentMarks(String name, int rollNumber, String[] subjects, int[] marks) {
        super(name, rollNumber);
        this.subjects = subjects;
        this.marks = marks;
    }

    @Override
    public void displayDetails() {
        displayBasicInfo();
        System.out.println("Marks in subjects:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
    }

    @Override
    public void checkPassFail() {
        int totalMarks = 0;
        boolean hasFailed = false;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 40) {
                System.out.println("Failed in " + subjects[i]);
                hasFailed = true;
            }
            totalMarks += marks[i];
        }

        double averageMarks = totalMarks / (double) marks.length;

        if (!hasFailed && averageMarks >= 40) {
            System.out.println("Result: Pass with Average Marks: " + averageMarks);
        } else {
            System.out.println("Result: Fail with Average Marks: " + averageMarks);
        }
    }
}

public class students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        String[] subjects = new String[numSubjects];
        System.out.println("Enter the names of the subjects:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = sc.next();
        }

        StudentMarks[] students = new StudentMarks[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEntering details for student " + (i + 1) + ":");

            System.out.print("Enter student name: ");
            String name = sc.next();

            System.out.print("Enter roll number: ");
            int rollNumber = sc.nextInt();

            int[] marks = new int[numSubjects];
            System.out.println("Enter marks for the subjects:");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print(subjects[j] + ": ");
                marks[j] = sc.nextInt();
            }

            students[i] = new StudentMarks(name, rollNumber, subjects, marks);
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nDetails for student " + (i + 1) + ":");
            students[i].displayDetails();
            students[i].checkPassFail();
        }

        sc.close();
    }
}

 

