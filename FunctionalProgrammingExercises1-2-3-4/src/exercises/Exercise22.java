package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Exercise22 {
    //use a real case calc how faster parallel streams with simple math
       public static void main(String[] args) {
//           long timeStamp1=System.currentTimeMillis();
//           System.out.println("without parallel streams sum= "+LongStream.range(0,1000000000).sum());
//           System.out.println("time taken approximately in milli seconds: "+(System.currentTimeMillis()-timeStamp1));
           long timeStamp2=System.currentTimeMillis();
           System.out.println("with parallel streams sum= "+LongStream.range(0,1000000000).parallel().sum());
           System.out.println("time taken approximately in milli seconds: "+(System.currentTimeMillis()-timeStamp2));




       }
}
