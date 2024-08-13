public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        switch (employee.getRole()) {
            case "Developer":
                return 5000;
            case "Manager":
                return 7000;
            default:
                return 3000;
        }
    }
}
