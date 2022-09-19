package classAandB;

public class Program {

    public static void main(String[] args) {

        // This is a small program that shows some information about an employee.
        Employee employee = new Employee("John Smith", 1234);
        Employee.grossSalary = 1300.0;
        Employee.tax = 100.0;

        System.out.println("Employee Name: " + employee.name);
        System.out.println("Employee Code: " + employee.getCode());
        System.out.println("Employee Net Salary: " + Employee.netSalary());
        System.out.println("Employee Bonus Salary: " + Employee.bonus());

    }
}