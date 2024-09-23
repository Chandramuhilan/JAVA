public class Employee_1 {
  private String name;
  private int id;
  private String department;

  public Employee_1(String name, int id, String department) {
    this.name = name;
    this.id = id;
    this.department = department;
  }

  public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Department: " + department);
  }

  public static void main(String[] args) {
    Employee_1 employee1 = new Employee_1("Chandramuhilan", 027, "Sales");
    Employee_1 employee2 = new Employee_1("Harinivash", 044, "Marketing");

    employee1.displayDetails();
    System.out.println();
    employee2.displayDetails();
  }
}
