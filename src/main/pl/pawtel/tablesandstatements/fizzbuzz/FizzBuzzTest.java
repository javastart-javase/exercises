package main.pl.pawtel.tablesandstatements.fizzbuzz;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class FizzBuzzTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(numbers);

//version with stream
        IntStream.rangeClosed(1, 100)
                .forEach(number -> {
                            if (number % 15 == 0)
                                System.out.println(number + " FizzBuzz");
                            else if (number % 3 == 0)
                                System.out.println(number + " Fizz");
                            else if (number % 5 == 0)
                                System.out.println(number + " Buzz");
                        }
                );
    }
}
