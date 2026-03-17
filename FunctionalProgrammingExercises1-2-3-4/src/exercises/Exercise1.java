package exercises;

import java.util.List;

public class Exercise1 {
    static List<Integer> numbers= List.of(1,2,4,2,4,2,6,5,5,7,8,9,0);
    // make a function that print only even numbers using functional programming
    public static void main(String[] args) {
        numbers.stream().filter(number->(number%2==0)).forEach(System.out::println);
    }
}
