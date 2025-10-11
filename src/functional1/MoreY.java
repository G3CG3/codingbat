package functional1;

import java.util.List;

/**
 * MoreY - CodingBat Functional-1
 *
 * Given a list of strings, returns a list where each string
 * has 'y' added at its start and end.
 * Uses Java's replaceAll() with a lambda expression.
 */
public class MoreY {

    /**
     * Adds 'y' to the start and end of each string in the list.
     *
     * @param strings list of strings
     * @return the modified list where each element is surrounded by 'y'
     */
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MoreY my = new MoreY();
        List<String> strings = java.util.Arrays.asList("a", "b", "c");
        System.out.println(my.moreY(strings)); // → [yay, yby, ycy]
    }
}
