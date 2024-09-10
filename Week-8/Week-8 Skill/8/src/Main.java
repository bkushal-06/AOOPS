import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create a list of 10 employees
        List<Employee> employees = Arrays.asList(
            new Employee("John Doe", 101, 75000),
            new Employee("Jane Smith", 102, 82000),
            new Employee("Alice Johnson", 103, 90000),
            new Employee("Bob Brown", 104, 50000),
            new Employee("Chris White", 105, 65000),
            new Employee("Eve Black", 106, 92000),
            new Employee("David Green", 107, 55000),
            new Employee("Frank Young", 108, 60000),
            new Employee("Grace Hall", 109, 87000),
            new Employee("Hank King", 110, 48000)
        );

        // 1. Filter employees with salary greater than 60,000
        List<Employee> filteredEmployees = employees.stream()
            .filter(e -> e.getSalary() > 60000)
            .collect(Collectors.toList());
        System.out.println("Employees with salary greater than 60,000:");
        filteredEmployees.forEach(System.out::println);

        // 2. Sort employees by salary
        List<Employee> sortedEmployees = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary))
            .collect(Collectors.toList());
        System.out.println("\nEmployees sorted by salary:");
        sortedEmployees.forEach(System.out::println);

        // 3. Find the employee with the highest salary
        Employee highestSalaryEmployee = employees.stream()
            .max(Comparator.comparingDouble(Employee::getSalary))
            .orElse(null);
        System.out.println("\nEmployee with the highest salary:");
        System.out.println(highestSalaryEmployee);

        // 4. Calculate the average salary of all employees
        double averageSalary = employees.stream()
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0.0);
        System.out.println("\nAverage salary of all employees: " + averageSalary);

        // Additional: Print the statistics of the salaries
        DoubleSummaryStatistics salaryStats = employees.stream()
            .mapToDouble(Employee::getSalary)
            .summaryStatistics();
        System.out.println("\nSalary Statistics:");
        System.out.println("Count: " + salaryStats.getCount());
        System.out.println("Sum: " + salaryStats.getSum());
        System.out.println("Min: " + salaryStats.getMin());
        System.out.println("Max: " + salaryStats.getMax());
        System.out.println("Average: " + salaryStats.getAverage());
    }
}
