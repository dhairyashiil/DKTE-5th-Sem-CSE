
import java.util.Scanner;
import java.util.Calendar;

public class InheritanceTest {

    public static void main(String[] args) {

        Student s = new Student();
        Employee e = new Employee();

        s.getData();
        e.getData();
        System.out.println("");
        s.printData();
        e.printData();

    }

}

class Person {

    String name, address;
    int height, weight, age;
    Date d = new Date();

    int year = Calendar.getInstance().get(Calendar.YEAR);

    public int calculateAge() {

        age = year - d.getYear();
        return age;
    }

}

class Student extends Person {

    int rollno, average;
    int marks[] = new int[3];

    Scanner sc = new Scanner(System.in);

    public int calculateAverage() {

        return (marks[0] + marks[1] + marks[2]) / 3;
    }

    void getData() {

        System.out.println("Enter rollno of Student");
        rollno = sc.nextInt();

        System.out.println("Enter name of Student");
        name = sc.next();

        System.out.println("Birth date in format dd/mm/yyyy");
        d.getDate();

        System.out.println("Enter height");
        height = sc.nextInt();

        System.out.println("Enter weight");
        weight = sc.nextInt();

        System.out.println("Enter address");
        address = sc.next();

        System.out.println("Enter marks of three subjects");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
    }

    void printData() {

        System.out.println("Rollno of Student is: " + rollno);
        System.out.println("Name of Student is: " + name);
        System.out.println("Birthdate if Student is: " + d.getDay() + "/" + d.getMonth() + "/" + d.getYear());
        System.out.println("Height of Student is: " + height);
        System.out.println("Weight of Student is: " + weight);
        System.out.println("Address of Student is: " + address);
        System.out.println("Average of Student: " + calculateAverage());
        System.out.println("Age of Student " + calculateAge());
    }

}

class Employee extends Person {

    int empId, salary;

    Scanner sc = new Scanner(System.in);

    public double calculateTax() {

        return salary * 0.1;
    }

    void getData() {

        System.out.println("Enter empId");
        empId = sc.nextInt();

        System.out.println("Enter name");
        name = sc.next();

        System.out.println("Birth date in format dd/mm/yyyy");
        d.getDate();

        System.out.println("Enter height");
        height = sc.nextInt();

        System.out.println("Enter weight");
        weight = sc.nextInt();

        System.out.println("Enter address");
        address = sc.next();

        System.out.println("Enter Salary");
        salary = sc.nextInt();
    }

    void printData() {

        System.out.println("empId of Employee is: " + empId);
        System.out.println("Name of Employee is: " + name);
        System.out.println("Birthdate if Employee is: " + d.getDay() + "/" + d.getMonth() + "/" + d.getYear());
        System.out.println("Height of Employee is: " + height);
        System.out.println("Weight of Employee is: " + weight);
        System.out.println("Address of Employee is: " + address);
        System.out.println("tax ratr is 10% sof tax for Employeeis: " + calculateTax());
        System.out.println("Age of Employee " + calculateAge());
    }

}

class Date {
    private int day, month, year;
    private String date, datearr[];

    Scanner sc = new Scanner(System.in);

    void getDate() {

        date = sc.next();
        datearr = date.split("/");

        day = Integer.parseInt(datearr[0]);
        month = Integer.parseInt(datearr[1]);
        year = Integer.parseInt(datearr[2]);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}