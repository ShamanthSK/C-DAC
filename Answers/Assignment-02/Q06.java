// Assignment 02 - Question 06: Employee Salary Calculation
public class Q06 {
    static double calculateSalary(double basicSalary) {
        double hra;
        if (basicSalary >= 50000) {
            hra = basicSalary * 0.20;
        } else {
            hra = basicSalary * 0.10;
        }
        return basicSalary + hra;
    }

    public static void main(String[] args) {
        double basicSalary = 55000.0;
        double finalSalary = calculateSalary(basicSalary);

        System.out.println("Basic Salary: Rs. " + basicSalary);
        System.out.println("Final Salary (with HRA): Rs. " + finalSalary);
    }
}