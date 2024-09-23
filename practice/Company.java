abstract class Employee {
  private String name;
  private String address;
  private double salary;
  private String jobTitle;

  public Employee(String name, String address, double salary, String jobTitle) {
      this.name = name;
      this.address = address;
      this.salary = salary;
      this.jobTitle = jobTitle;
  }

  public abstract double calculateBonus();
  
  public String generatePerformanceReport() {
      return "Performance report for " + name + ": Excellent performance.";
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getAddress() {
      return address;
  }

  public void setAddress(String address) {
      this.address = address;
  }

  public double getSalary() {
      return salary;
  }

  public void setSalary(double salary) {
      this.salary = salary;
  }

  public String getJobTitle() {
      return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
      this.jobTitle = jobTitle;
  }
}

class Manager extends Employee {

  public Manager(String name, String address, double salary, String jobTitle) {
      super(name, address, salary, jobTitle);
  }

  @Override
  public double calculateBonus() {
      return getSalary() * 0.20;
  }

  public void manageProject() {
      System.out.println(getName() + " is managing the project.");
  }
}

class Developer extends Employee {
  public Developer(String name, String address, double salary, String jobTitle) {
      super(name, address, salary, jobTitle);
  }

  @Override
  public double calculateBonus() {
      return getSalary() * 0.15;
  }

  public void developSoftware() {
      System.out.println(getName() + " is developing software.");
  }
}

class Programmer extends Employee {
  public Programmer(String name, String address, double salary, String jobTitle) {
      super(name, address, salary, jobTitle);
  }

  @Override
  public double calculateBonus(){
    return getSalary() * 0.10;
  }

  public void writeCode() {
      System.out.println(getName() + " is writing code.");
  }
}

public class Company {
  public static void main(String[] args) {
      Manager manager = new Manager("Alice", "123 Main St", 90000, "Manager");

      Developer developer = new Developer("Bob", "456 Elm St", 80000, "Developer");

      Programmer programmer = new Programmer("Charlie", "789 Oak St", 70000, "Programmer");

      System.out.println(manager.getName() + "'s bonus: " + manager.calculateBonus());
      System.out.println(developer.getName() + "'s bonus: " + developer.calculateBonus());
      System.out.println(programmer.getName() + "'s bonus: " + programmer.calculateBonus());

      System.out.println(manager.generatePerformanceReport());
      System.out.println(developer.generatePerformanceReport());
      System.out.println(programmer.generatePerformanceReport());

      manager.manageProject();
      developer.developSoftware();
      programmer.writeCode();
  }
}
