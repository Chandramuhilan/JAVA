
class Employee {
  private double salary;
  private String name;
  private int employee_id;

  void work(String name, int employee_id) {
      this.name = name;
      this.employee_id = employee_id;
      System.out.println("I am from Parent class");
  }

  double getSalary(double salary) {
      this.salary = salary;
      return salary;
  }

  public double getSalary() {
      return salary;
  }

  public void setSalary(double salary) {
      this.salary = salary;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public int getEmployeeId() {
      return employee_id;
  }

  public void setEmployeeId(int employee_id) {
      this.employee_id = employee_id;
  }
}

class HR_Manager extends Employee {
  @Override
  void work(String name, int employee_id) {
      super.setName(name);
      super.setEmployeeId(employee_id);
  }

  public void addEmployee(String name, int employee_id, double salary) {
      System.out.println("Name: " + name);
      System.out.println("Employee id: " + employee_id);
      System.out.println("Salary: " + salary);
  }
}

public class Employee_1 {
  public static void main(String[] args) {
      HR_Manager obj1 = new HR_Manager();
      obj1.addEmployee("Chandramuhilan", 23027, 100000);
      obj1.work("Arun", 398734);
      obj1.addEmployee(null, 0, 0);
  }
}
