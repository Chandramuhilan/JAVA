import java.util.Scanner;

public class Student {
  public static void main(String[] args){
    int age;
    String name;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name : ");
    name = sc.nextLine();
    System.out.println("Enter your age : ");
    age = sc.nextInt();
   Display obj1 = new Display();
   obj1.display(name,age);
   sc.close();
  }
}

class Display{
  void display(String name, int age){
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
  }
}
