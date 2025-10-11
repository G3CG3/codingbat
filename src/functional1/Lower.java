package functional1;

import java.util.List;

/**
 * Lower - CodingBat Functional-1
 *
 * Given a list of strings, returns a list where each string
 * is converted to lowercase using String.toLowerCase().
 */
public class Lower {

    /**
     * Converts each string in the list to lowercase.
     *
     * @param strings list of strings
     * @return modified list with all strings in lowercase
     */
    public List<String> lower(List<String> strings) {
        strings.replaceAll(String::toLowerCase);
        return strings;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Lower l = new Lower();
        List<String> strings = java.util.Arrays.asList("Hello", "Hi", "HOw", "Are", "YOU");
        System.out.println(l.lower(strings)); // → [hello, hi, how, are, you]
    }
}
