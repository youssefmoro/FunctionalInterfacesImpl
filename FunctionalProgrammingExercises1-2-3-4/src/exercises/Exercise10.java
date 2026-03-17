package exercises;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {
    static List<Integer> numbers= List.of(1,2,4,2,4,2,6,5,5,7,8,9,0);
    // create alist of even numbers filtered from the numbers list sorted and distinct numbers only
    public static void main(String[] args) {
        List<Integer> evenNumbers=numbers.stream().filter(n->n%2==0).sorted(Comparator.naturalOrder()).distinct().collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
