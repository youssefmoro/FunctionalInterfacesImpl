package exercises;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise13 {
    static List<Integer> numbers= List.of(1,2,4,2,4,2,6,5,5,7,8,9,0);
    // make the impl of Integer::sum at a reduce function
    public static void main(String[] args) {
        Function<Integer,Integer> squareFunc= x->x*x;
        List<Integer> numbersSquared = getNumbersMapped(squareFunc);
        List<Integer> numbersCubed = getNumbersMapped(x->x*x*x);
        System.out.println(numbersCubed);
    }

    private static List<Integer> getNumbersMapped(Function<Integer, Integer> func) {
        return numbers.stream().map(func).collect(Collectors.toList());
    }
}
