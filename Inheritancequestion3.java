//Francis Waithaka Wainaina J77-11170-2024

/*java program that accept input from the user for name, salary,and 
department,then it creates a lecturer object and displays all
information using overridden method*\

import java.util.Scanner;

// Parent class Employee
class Employee {
    String name;     // employee name
    double salary;   // employee salary

    // Method to display employee info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Child class Lecturer inherits from Employee
class Lecturer extends Employee {
    String department;   // lecturer's department

    // Override displayInfo to include department
    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

// Main class to test inheritance
public class UniversitySystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Lecturer lec = new Lecturer(); // create Lecturer object

        System.out.print("Enter name: ");
        lec.name = input.nextLine();

        System.out.print("Enter salary: ");
        lec.salary = input.nextDouble();
        input.nextLine(); // consume newline

        System.out.print("Enter department: ");
        lec.department = input.nextLine();

        lec.displayInfo(); // call overridden method
    }
}
