package java8.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaStream {
    public static void main(String[] args) throws IOException {
        List<String> companies = Arrays.asList("Facebook","flag","amazon","apple");

        List<String> sortedCo = companies.stream()
                .filter(c -> c.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedCo);

        //----------------------------------------------------
        //change array to stream / arrayからstreamに転換
        String [] companies2 = {"Facebook","flag","amazon","apple"};
        List<String> sorted2 = Stream.of(companies2)
                .filter(c -> c.startsWith("F"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted2);
        
        
        //----------------------------------------------------
        //change collection to stream / collection から streamに転換 
        Set<String> set = new HashSet<>(companies);
        List<String> sorted3 = set.stream()
                .filter(c -> c.startsWith("f"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted3);

        //----------------------------------------------------
        //get the information from file to stream　ローカルファイルから情報をstreaｍに転換
        try{

            Stream<String> fromFile = Files.lines(Paths.get("src/com/company/java8/test.txt"));
            List<String> sorted4 = fromFile
                    .filter(c -> c.startsWith("F"))
                    .map(String::toUpperCase)
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println(sorted4);

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
