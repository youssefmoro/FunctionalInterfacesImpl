package exercises;

import java.util.List;

public class Exercise6{
    static List<String> courses= List.of("spring","springBoot","spring Security","Spring data","JPA","Batch");
    // print all courses that has at least 4 letters
    public static void main(String[] args) {
        courses.stream().map(course->course.concat(" ,Name Length : "+course.length())).forEach(System.out::println);
    }
}
