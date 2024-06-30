import java.util.Objects;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Darth Vader", 1, 2000);
        employees[1] = new Employee("Luke Skywalker", 2, 2500);



        printAllEmployees();
        System.out.println("Total monthly salary expenses: " + calculateTotalSalaryExpenses());
        System.out.println("Employee with minimum salary: " + findEmployeeWithMinSalary());
        System.out.println("Employee with maximum salary: " + findEmployeeWithMaxSalary());
        System.out.println("Average salary: " + calculateAverageSalary());
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static double calculateTotalSalaryExpenses() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        double totalSalary = calculateTotalSalaryExpenses();
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return totalSalary / count;
    }
}
