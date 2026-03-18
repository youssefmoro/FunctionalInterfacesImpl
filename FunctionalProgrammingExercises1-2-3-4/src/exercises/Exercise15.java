package exercises;

import java.util.List;

public class Exercise15 {
    static List<String> courses= List.of("spring","springBoot","spring Security","Spring data","JPA","Batch");
    // use limit,skip to print,skip,takewhile only first three courses that match the condition length>2
    public static void main(String[] args) {
//        courses.stream().filter(x->x.length()>2).limit(3).forEach(System.out::println);
//        courses.stream().filter(x->x.length()>2).skip(3).forEach(System.out::println);
        courses.stream().takeWhile(x->"spring".equals(x)).forEach(System.out::println);

    }
}
