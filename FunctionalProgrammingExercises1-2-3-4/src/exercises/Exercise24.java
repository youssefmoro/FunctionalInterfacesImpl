package exercises;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise24 {
    // get unique words from a file using function programming
       public static void main(String[] args) throws IOException {
           Files.lines(Paths.get("file.txt")).map(str->str.split(" "))
                   .flatMap(Arrays::stream).distinct().forEach(System.out::println);
           //list directories at the directory of your project
           Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);
       }
}
