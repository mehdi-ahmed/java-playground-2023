package streams;

import java.util.Arrays;
import java.util.List;

public class SimpleExamples {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("a", "ab", "abc", "abcd");
        System.out.println("Before = " + words); //[a, ab, abc, abcd]

        // Streams: Filter with filter() and Transform with map()
        List<String> transformedWords = words.stream()
                .filter(w -> w.length() > 1)
                .map(String::toUpperCase)
                .toList();

        System.out.println("After = " + transformedWords); // [AB, ABC, ABCD]
    }
}
