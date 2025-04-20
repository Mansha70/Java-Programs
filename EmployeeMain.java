//wap in java to input info of n employees and name find summation of salary,
//diffrent data member must be defined in private section.
import java.util.Scanner;

class Employee {
    
    private String name;
    private String code;
    private double salary;


    public Employee(String name, String code, double salary) {
        this.name = name;
        this.code = code;
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }


    public void displayEmployee() {
        System.out.println("Name: " + name + ", code: " + code + ", Salary: " + salary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Employee[] employees = new Employee[n];
        double totalSalary = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for Employee " + i + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("code: ");
            int age = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 

           
            employees[i] = new Employee(name,age, salary);
            totalSalary += salary;
        }

        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.displayEmployee();
        }

        
        System.out.println("\nTotal Salary of all Employees: " + totalSalary);

        scanner.close();
    }
}
