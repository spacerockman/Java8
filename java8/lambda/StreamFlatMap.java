package java8.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamFlatMap {
    public static void main(String[] args) {
        //differences from map and flatMap

        //map
        List<String> words = Arrays.asList("Hello","World");
        words.stream()
                .map(w -> w.split(""))
                .forEach(System.out::println);
        //flatMap
        words.stream()
                .flatMap(w -> Arrays.stream( w.split("")))
                .forEach(System.out::println);

    }
}
