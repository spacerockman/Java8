package java8.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamState {


    public static void main(String[] args) {
        List<String> distinctDemo = Arrays.asList("Lion","haha","Lion");
        distinctDemo.stream()
                .distinct()
                .forEach(x -> System.out.println(x));

        List<String> sortedDemo = Arrays.asList("Lion","haha","Lion");
        sortedDemo.stream()
                .sorted()
                .forEach(x -> System.out.println(x + "========="));

        List<String> limitDemo = Arrays.asList("Lion","haha","Lion");
        limitDemo.stream()
                .limit(2)
                .forEach(x -> System.out.println(x));

        List<String> skipDemo = Arrays.asList("LionSkip","haha","Lion");
        skipDemo.stream()
                .skip(1)
                .forEach(x -> System.out.println(x));

        //parallel it can use the cpu sufficiently
        //best for Arrays,Hashmap..
        //worst for IO，LinkedList...
        List<String> parallelDemo = Arrays.asList("LionSkip","haha","Lion");
        parallelDemo.stream()
                .parallel()
                .skip(1)
                .forEach(x -> System.out.println(x));
    }
}

