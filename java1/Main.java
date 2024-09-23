class Employee {
  private String empName;
  private int empId;
  private double empSal;

  public Employee(String empName, int empId, double empSal) {
      this.empName = empName;
      this.empId = empId;
      this.empSal = empSal;
  }
  public String getEmpName() {
      return empName;
  }
  public void setEmpName(String empName) {
      this.empName = empName;
  }
  public int getEmpId() {
      return empId;
  }
  public void setEmpId(int empId) {
      this.empId = empId;
  }
  public double getEmpSal() {
      return empSal;
  }
  public void setEmpSal(double empSal) {
      this.empSal = empSal;
  }
  public void displayDetails() {
      System.out.println("Employee Name: " + empName);
      System.out.println("Employee ID: " + empId);
      System.out.println("Employee Salary: " + empSal);
  }
}

class Manager extends Employee {
  private double bonus;

  public Manager(String empName, int empId, double empSal, double bonus) {
      super(empName, empId, empSal);
      this.bonus = bonus;
  }

  public double getBonus() {
      return bonus;
  }

  public void setBonus(double bonus) {
      this.bonus = bonus;
  }

  @Override
  public void displayDetails() {
      super.displayDetails();
      System.out.println("Bonus: " + bonus);
  }
}

public class Main {
  public static void main(String[] args) {
     
      Manager manager = new Manager("John Doe", 101, 75000, 5000);

      // Accessing manager details
      manager.displayDetails();
  }
}
