package exercises;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise19 {
    static List<String> courses= List.of("springBoot","spring","spring Security","Spring data","JPA","Batch");
    static List<String> teachers=List.of();
    // concat all strings  of the list comma separated using functional programming with no .concat used
       public static void main(String[] args) {
     System.out.println(courses.stream().collect(Collectors.joining(",")));
       }
}
