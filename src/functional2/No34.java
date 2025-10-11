package functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * No34 - CodingBat Functional-2
 *
 * Given a list of strings, returns a new list omitting
 * any string of length 3 or 4.
 */
public class No34 {

    /**
     * Removes strings of length 3 or 4 from the list.
     *
     * @param strings list of strings
     * @return the list with strings of length 3 or 4 removed
     */
    public List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() < 3 || s.length() > 4)
                .collect(Collectors.toList());
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        No34 nf = new No34();
        List<String> input = java.util.Arrays.asList("hi", "cat", "home", "dog", "tree");
        System.out.println(nf.no34(input)); // → [hi, dog]
    }
}
