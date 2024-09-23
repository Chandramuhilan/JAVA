// Program to demonstrate the use of classes and objects in Java
class classpg
{
  public static void main(String[] args){
    sample obj1 = new sample();
    sample obj2 = new sample();
    obj1.a = 10;
    obj2.a = 20;
    obj1.display();
    obj2.display();
}
}

class sample{
  int a;
  void display(){
    System.out.println("Welcome to Classes and Objects in Java");
    System.out.println("Printed through objects : " + a);
  }
}