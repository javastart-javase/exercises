/*
Napisz program, w którym dodasz do siebie trzy liczby zmiennoprzecinkowe a sumę wyświetlisz na ekranie.
Program napisz w dwóch wersjach:
- bez wykorzystywania zmiennych
- z wykorzystaniem zmiennych do przechowywania liczb oraz wyniku dodawania
Przy wyświetlaniu zaokrąglij wynik do dwóch miejsc po przecinku. Wynik powinien być wyświetlony w formie:

A + B + C = WYNIK
*/

package main.pl.pawtel.definingvariables;

public class DefiningVars {
    public static void main(String[] args) {
        System.out.printf("%.2f + %.2f + %.2f = %.2f", 3.0, 2.5, 6.4, (3.0 + 2.5 + 6.4));
        System.out.println();

        double a = 4.3333;
        double b = 5.234;
        double c = 9.213;

        double sum2 = a + b + c;
        System.out.printf("%.2f + %.2f + %.2f = %.2f", a, b, c, sum2);
    }
}
