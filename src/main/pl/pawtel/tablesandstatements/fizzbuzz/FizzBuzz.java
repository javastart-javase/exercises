package main.pl.pawtel.tablesandstatements.fizzbuzz;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FizzBuzz {

    public void fizzBuzz(ArrayList<Integer> numbers) {
        for (Integer i = 1; i < 101; i++) {
            numbers.add(i);
        }
        for (Integer iNumber : numbers) {
            if (iNumber % 3 == 0)
                System.out.println(iNumber + " Fizz");
            if (iNumber % 5 == 0)
                System.out.println(iNumber + " BUZZ");
            if (iNumber % 3 == 0 && iNumber % 5 == 0)
                System.out.println(iNumber + " FizzBuzz");
        }
    }
}