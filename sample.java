
 class pg11 {
  void sum(int a , int b){
    int c;
    c = a + b;
    System.out.println("Answer from method 1 = " + c);
  }
  void sum(int a, int b, int c){
    int d;
    d = a + b + c;
    System.out.println("Answer from method 1 = " + d );
  }
}

public class sample
{
  public static void main(String[] args){
    pg11 ob = new pg11();
    ob.sum(5, 10);
    ob.sum(5, 10, 15);
  }
}
