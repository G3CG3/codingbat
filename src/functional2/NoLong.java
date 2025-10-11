package functional2;

import java.util.List;

/**
 * NoLong - CodingBat Functional-2
 *
 * Given a list of strings, returns a new list omitting
 * any string of length 4 or more.
 */
public class NoLong {

    /**
     * Removes strings of length 4 or more from the list.
     *
     * @param strings list of strings
     * @return the list with long strings removed
     */
    public List<String> noLong(List<String> strings) {
        strings.removeIf(s -> s.length() >= 4);
        return strings;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        NoLong nl = new NoLong();
        List<String> input = java.util.Arrays.asList("cat", "house", "dog", "elephant");
        System.out.println(nl.noLong(input)); // → [cat, dog]
    }
}
