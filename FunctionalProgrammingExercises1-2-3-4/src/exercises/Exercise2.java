package exercises;

import java.util.List;

public class Exercise2 {
    static List<String> courses= List.of("spring","springBoot","spring security","spring data");
    // print all courses indvidually using functional programming
    public static void main(String[] args) {
        courses.stream().forEach(System.out::println);
    }
}
