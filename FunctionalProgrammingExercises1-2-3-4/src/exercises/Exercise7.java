package exercises;

import java.util.List;

public class Exercise7 {
    static List<String> courses= List.of("spring","springBoot","spring Security","Spring data","JPA","Batch");
    static List<Integer> numbers= List.of(1,2,4,2,4,2,6,5,5,7,8,9,0);
    // square every number in a list and find the sum of the squares
    public static void main(String[] args) {
        System.out.println(numbers.stream().map(number->number*number).reduce(Integer::sum));
    }
}
