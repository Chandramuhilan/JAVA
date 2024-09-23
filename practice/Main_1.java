class Vehicle {
  public void drive() {
    System.out.println("Repairing a  Car");
  }
}

class Car extends Vehicle {
  @Override
  public void drive() {
    System.out.println("Driving a Car");
  
  }
}

public class Main_1{
  public static void main(String[] args) {
    System.out.println("Main class");
    Car c = new Car();
    c.drive();
  }
}