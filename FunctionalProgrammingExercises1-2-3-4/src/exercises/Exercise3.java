package exercises;

import java.util.List;

public class Exercise3 {
    static List<String> courses= List.of("spring","springBoot","spring Security","Spring data","JPA","Batch");
    // print all courses that has spring word inside the string of it
    public static void main(String[] args) {
        courses.stream().filter(course->course.toLowerCase().contains("spring")).forEach(System.out::println);
    }
}
