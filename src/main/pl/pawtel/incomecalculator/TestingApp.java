package main.pl.pawtel.incomecalculator;

public class TestingApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Adam", "Nowak", 3000);
        double netto = PaymentCalculator.yearlyPaymentNetto(employee);
        double brutto = PaymentCalculator.yearlyPaymentBrutto(employee);
        System.out.println(netto);
        System.out.println(brutto);
    }
}
