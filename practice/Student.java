import java.util.*;

public class Student {
  public static void main(String[] args){

    int number_of_students;
    int number_of_subjects;
    Scanner sc = new Scanner(System.in);
    Scanner sa = new Scanner(System.in);
    System.out.println("Enter the number of students  : ");
    number_of_students = sc.nextInt();
    System.out.println("Enter number of subjects : ");
    number_of_subjects = sc.nextInt();

    String names[] = new String[number_of_students];
    int marks[]  = new int[number_of_subjects];

    for(int i = 1 ; i <= number_of_students; i++){
      System.out.println("Enter student " + i + " name : ");
      names[i] = sa.nextLine();
      System.out.println("Enter " + number_of_subjects + " subject marks for student" + i);
      for(int j = 0;j < number_of_subjects;j++){
        marks[i] = sc.nextInt();
      }
      System.out.println(" Mark details : ");
      int total = 0;
      for(int k = 0;k< number_of_subjects;k++){
        total = total + marks[k];
      }
      int avg = total/number_of_subjects;
      System.out.println(" Student " + i + " avg mark = " + avg);
      if(avg > 90) System.out.println("Excellent");
      else if( avg < 89 ) System.out.println("Good"); 
    }

  }
}
