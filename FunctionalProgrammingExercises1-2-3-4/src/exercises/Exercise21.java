package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise21 {
    static List<String> courses= List.of("springBoot2132saasa32","spring323sasasasas2323","spring Security","Spring data","JPA","Batch");
    static List<String> teachers=List.of();
    //create a higher order function using functional programming
     public static void main(String[] args) {

         Predicate<String> courseLengthGreaterThan10=returnComparisonFunctionWithLengthOfCoursePassed(10);
         Predicate<String> courseLengthGreaterThan20=returnComparisonFunctionWithLengthOfCoursePassed(20);
         courses.stream().filter(courseLengthGreaterThan10).forEach(System.out::println);
         System.out.println("----------------------------------------------------");
         courses.stream().filter(courseLengthGreaterThan20).forEach(System.out::println);

     }

       static Predicate<String> returnComparisonFunctionWithLengthOfCoursePassed(int courseLength){
         return course->course.length()>courseLength;
       }
}
