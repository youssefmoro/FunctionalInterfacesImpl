package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise20 {
    static List<String> courses= List.of("springBoot","spring","spring Security","Spring data","JPA","Batch");
    static List<String> teachers=List.of();
    //split all courses into characters and erase the repeated characters even with diff cases
       public static void main(String[] args) {

           System.out.println(courses.stream()
                   .map(course->course.toLowerCase().split("")).flatMap(Arrays::stream)
                   .distinct().collect(Collectors.toList()));
       }
}
