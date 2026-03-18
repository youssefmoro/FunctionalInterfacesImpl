package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise23 {
    static List<String> courses = List.of("springBoot", "spring", "spring Security", "Spring data", "JPA", "Batch");

    // use replace all
    public static void main(String[] args) {
        List<String> courseArrayList = new ArrayList<>(courses);
        System.out.println(courseArrayList);
        System.out.println("-------------------------------");
        courseArrayList.replaceAll(str->str.toUpperCase());
        System.out.println(courseArrayList);
    }
}
