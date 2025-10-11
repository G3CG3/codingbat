package functional1;

import java.util.List;

/**
 * Copies3 - CodingBat Functional-1
 *
 * Given a list of strings, returns a list where each string
 * is replaced by 3 copies of itself concatenated together.
 * Uses Java's replaceAll() with a lambda expression.
 */
public class Copies3 {

    /**
     * Replaces each string in the list with 3 concatenated copies of itself.
     *
     * @param strings list of strings
     * @return the modified list where each element is tripled
     */
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        return strings;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Copies3 c = new Copies3();
        List<String> strings = java.util.Arrays.asList("a", "bb", "ccc");
        System.out.println(c.copies3(strings)); // → [aaa, bbbbbb, cccccccccc]
    }
}
