package exercises;

import java.util.List;

public class Exercise4 {
    static List<String> courses= List.of("spring","springBoot","spring Security","Spring data","JPA","Batch");
    // print all courses that has at least 4 letters
    public static void main(String[] args) {
        courses.stream().filter(course->course.length()>3).forEach(System.out::println);
    }
}
