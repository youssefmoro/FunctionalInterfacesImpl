package exercises;

import java.util.Comparator;
import java.util.List;

public class Exercise16 {
    static List<String> courses= List.of("springBoot","spring","spring Security","Spring data","JPA","Batch");
    static List<String> teachers=List.of();
    // use max,min to get the longest string
       public static void main(String[] args) {
      System.out.println(courses.stream().max(Comparator.comparingInt(String::length)));
      System.out.println(courses.stream().min(Comparator.comparingInt(String::length)));
      //longest teacher name or else name him ronaldo
      System.out.println(teachers.stream().max(Comparator.comparingInt(String::length)).orElse("ronaldo"));
      //find first value matches your condition: contains spring
      System.out.println(courses.stream().filter(x->x.contains("spring")).findFirst());
      //find any value matches not a guarantee it acts as a circuit breaker once triggered done
      System.out.println(courses.stream().filter(x->x.contains("spring")).findAny());

       }
}
