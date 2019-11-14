package main.pl.pawtel.incomecalculator;

public class PaymentCalculator {

    Employee employee;

    public double yearlyPaymentNetto(Employee employee) {
        double employeeYearlyPaymentNetto;
        employeeYearlyPaymentNetto = employee.getMonthlySalary() * 12;
        return employeeYearlyPaymentNetto;
    }

    public double yearlyPaymentBrutto(Employee employee) {
        double employeeYearlyPaymentBrutto;
        double zus = 12 * 1000;
        double tax = 0.2 * employee.getMonthlySalary();
        employeeYearlyPaymentBrutto = zus + (12 * (employee.getMonthlySalary() + tax));
        return employeeYearlyPaymentBrutto;
    }
}
