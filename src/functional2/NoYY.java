package functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * NoYY - CodingBat Functional-2
 *
 * Given a list of strings, returns a new list where each string
 * has "y" added at its end, omitting any resulting string
 * that contains "yy" as a substring.
 */
public class NoYY {

    /**
     * Appends "y" to each string, filtering out strings containing "yy".
     *
     * @param strings list of input strings
     * @return modified list with "y" added and no "yy" strings
     */
    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        NoYY ny = new NoYY();
        List<String> input = java.util.Arrays.asList("a", "b", "y", "hey");
        System.out.println(ny.noYY(input)); // → [ay, by, hey y]
    }
}
