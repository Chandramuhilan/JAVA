// Program to find the factorial of a number using recursion
import java.util.*;
public class Factorial {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    simple s = new simple();
    System.out.println("Factorial of " + n + " is " + s.factorial(n));
    sc.close();
  }
  
  }
class simple{
  int  factorial(int n){
    if(n == 0)
      return 1;
    else
    return n * factorial(n-1);
}

// Another method to find the factorial of a number using iteration
/* 
int factorial(int n){
  int fact = 1;
  for(int i = 1; i <= n; i++){
    fact = fact * i;
  }
  return fact;
}
*/ 

}
