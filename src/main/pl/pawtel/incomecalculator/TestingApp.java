package main.pl.pawtel.incomecalculator;

public class TestingApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Adam", "Nowak", 3000);
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        double netto = paymentCalculator.yearlyPaymentNetto(employee);
        double brutto = paymentCalculator.yearlyPaymentBrutto(employee);
        System.out.println(netto);
        System.out.println(brutto);
    }
}
