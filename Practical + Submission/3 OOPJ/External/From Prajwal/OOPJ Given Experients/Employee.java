
class Employee {
    // Instance variable
    private String firstName;
    private String lastName;
    private double salary;

    // Default constructor
    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.salary = 0.0;
    }

    // parameterized Constructor
    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (salary < 0) {
            this.salary = 0.0;
        } else {
            this.salary = salary;
        }
    }

    // Setter and getter for firstName
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Setter and getter for lastName
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Setter and getter for salary
    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            this.salary = 0.0;
        } else {
            this.salary = salary;
        }
    }

    // Display information
    public void getEmployee() {
        System.out.println("FirstName : " + this.firstName);
        System.out.println("LastName  : " + this.lastName);
        System.out.println("Month Salary: " + this.salary);
        System.out.println("Yearly Salary: " + this.salary * 12);
    }

    public double getYearlySalary() {
        double sal;
        sal = 12 * this.salary;
        return sal;
    }

    public double getRaisedYearlySalary(float percent) {
        double sal;
        sal = 12 * this.salary;
        sal = sal + (sal * percent) / 100;
        return sal;
    }

}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee E1 = new Employee("virat", "kohali", 30000);
        Employee E2 = new Employee("sachin", "tendulakar", 40000);
        System.out.println("Employee E1");
        E1.getEmployee();
        System.out.println("Employee E2");
        E2.getEmployee();
        System.out.println("Salary of Employee E1 After 10% raise");
        System.err.println("Salary of E1 = " + E1.getRaisedYearlySalary(10));
        System.out.println("Salary of Employee E2 After 10% raise");
        System.err.println("Salary of E2 = " + E2.getRaisedYearlySalary(10));
    }
}