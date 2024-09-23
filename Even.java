// Program to check whether the given number is even or odd
import java.util.*;
public class Even {
  public static void main(String[] args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number : ");
   int n = sc.nextInt();
  if(n % 2 == 0)
      {
      System.out.println(n + " is Even number");
      }
  else{
    System.out.println(n + " is Odd number");
  }
  sc.close();
    }
  }

