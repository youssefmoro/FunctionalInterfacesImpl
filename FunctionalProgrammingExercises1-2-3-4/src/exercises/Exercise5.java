package exercises;

import java.util.List;

public class Exercise5 {
    static List<Integer> numbers= List.of(1,2,4,2,4,2,6,5,5,7,8,9,0);
    // make a function that print only cubes of odd numbers using functional programming
    public static void main(String[] args) {
        numbers.stream().filter(number->(number%2!=0)).map(number->number*number*number).forEach(System.out::println);
    }
}
