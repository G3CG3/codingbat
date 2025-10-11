package functional1;

import java.util.List;

/**
 * NoX - CodingBat Functional-1
 *
 * Given a list of strings, returns a list where each string
 * has all occurrences of the character 'x' removed.
 */
public class NoX {

    /**
     * Removes all 'x' characters from each string in the list.
     *
     * @param strings list of strings
     * @return modified list with 'x' removed from all strings
     */
    public List<String> noX(List<String> strings) {
        strings.replaceAll(s -> s.replace("x", ""));
        return strings;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        NoX nx = new NoX();
        List<String> strings = java.util.Arrays.asList("ax", "bb", "cx");
        System.out.println(nx.noX(strings)); // → [a, bb, c]
    }
}
