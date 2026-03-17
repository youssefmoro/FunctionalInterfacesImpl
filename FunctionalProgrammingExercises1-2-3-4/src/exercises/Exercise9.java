package exercises;

import java.util.List;

public class Exercise9 {
    static List<Integer> numbers= List.of(1,2,4,2,4,2,6,5,5,7,8,9,0);
    // sum of odd numbers in a list
    public static void main(String[] args) {
        System.out.println(numbers.stream().filter(x->(x%2!=0)).reduce(Integer::sum));
    }
}
