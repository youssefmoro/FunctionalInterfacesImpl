package exercises;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Exercise18 {
    // use intstream iterate and play with streams
       public static void main(String[] args) {
           IntStream.of(1,2,5,0,11,7).forEach(System.out::println);
           IntStream.iterate(0,e->e+5).limit(20).forEach(System.out::println);
//           //calculate the first 6 powers of 2
           LongStream.iterate(2, x->x*x).limit(6).forEach(System.out::println);

       }
}
