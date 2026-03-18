package exercises;

import java.util.List;

public class Exercise14 {
    static List<String> courses= List.of("spring","springBoot","spring Security","Spring data","JPA","Batch");
    // use any match and check if the list has the word cloud inside it
    public static void main(String[] args) {
        System.out.println(courses.stream().anyMatch(course->course.toLowerCase().contains("cloud")));
        System.out.println(courses.stream().noneMatch(course->course.toLowerCase().contains("cloud")));
        System.out.println(courses.stream().allMatch(course->course.toLowerCase().contains("spring")));
    }
}
