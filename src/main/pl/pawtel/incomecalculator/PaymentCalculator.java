package main.pl.pawtel.incomecalculator;

public class PaymentCalculator {

    Employee employee;

    public static double yearlyPaymentNetto(Employee employee) {
        return employee.getMonthlySalary() * 12;
    }

    public static double yearlyPaymentBrutto(Employee employee) {
        double zus = 12 * 1000;
        double tax = 0.2 * employee.getMonthlySalary();
        return zus + (12 * (employee.getMonthlySalary() + tax));
    }
}
