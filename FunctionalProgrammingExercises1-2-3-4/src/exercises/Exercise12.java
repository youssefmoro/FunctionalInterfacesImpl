package exercises;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise12 {
    static List<Integer> numbers= List.of(1,2,4,2,4,2,6,5,5,7,8,9,0);
    // make the impl of Integer::sum at a reduce function
    public static void main(String[] args) {
       System.out.println(numbers.stream().reduce(Integer::sum));
    }
    private static BinaryOperator<Integer> getSum() {
        return Integer::sum;
    }

    BinaryOperator<Integer> binaryOperator= new BinaryOperator<Integer>() {
        @Override
        public Integer apply(Integer integer1, Integer integer2) {
            return integer1+integer2;
        }
    };
}
