package exercises;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise11 {
    static List<String> courses= List.of("spring","springBoot","spring Security","Spring data","JPA","Batch");
    // create a list with lengths of course titles
    public static void main(String[] args) {
        List<Integer> courseTitlesLength=courses.stream().map(name->name.length()).collect(Collectors.toList());
        System.out.println(courses);
        System.out.println(courseTitlesLength);
    }
}
