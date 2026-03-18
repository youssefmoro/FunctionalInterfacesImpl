package exercises;

import java.util.Comparator;
import java.util.List;

public class Exercise17 {
    static List<String> courses= List.of("springBoot","spring","spring Security","Spring data","JPA","Batch");
    static List<String> teachers=List.of();
    // get string with max,min length and average and sum of lengths
       public static void main(String[] args) {
        System.out.println(courses.stream().mapToInt(courses->courses.length()).sum());
        System.out.println(courses.stream().mapToInt(courses->courses.length()).average());
        System.out.println(courses.stream().mapToInt(courses->courses.length()).max());
        System.out.println(courses.stream().mapToInt(courses->courses.length()).min());
        System.out.println(courses.stream().mapToInt(courses->courses.length()).count());

       }
}
