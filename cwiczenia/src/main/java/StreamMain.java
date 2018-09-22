import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class StreamMain {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Renault",
            "Peugeot", "Toyota", "Volvo", "BMW", "FSO");

        System.out.println(strings.stream()
            .sorted((s1, s2) -> {
                int result = s2.length() - s1.length();
                if (result == 0) {
                    return s2.compareTo(s1);
                }

                return result;
            })
            .collect(toList()));
//
//        String s = strings.stream().collect(joining(", "));
//        System.out.println(s);
//
//        Set<String> set = strings.stream().collect(toSet());
//        System.out.println(set);
//
//        List<Integer> ints = Arrays.asList(2, 2, 3, 4, 4, 5, 6, 6);
//        System.out.println(ints.stream().distinct().collect(toList()));
//        System.out.println(ints.stream().collect(toSet()));
    }
}
