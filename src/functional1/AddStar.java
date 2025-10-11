package functional1;

import java.util.List;

/**
 * AddStar - CodingBat Functional-1
 *
 * Given a list of strings, returns a list where each string
 * has "*" added at its end.
 * Uses Java's replaceAll() with a lambda expression for concise implementation.
 */
public class AddStar {

    /**
     * Adds a "*" character at the end of each string in the list.
     *
     * @param strings list of strings
     * @return the modified list with "*" appended to each string
     */
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s + "*");
        return strings;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        AddStar a = new AddStar();
        List<String> strings = java.util.Arrays.asList("a", "bb", "ccc");
        System.out.println(a.addStar(strings)); // → [a*, bb*, ccc*]
    }
}
