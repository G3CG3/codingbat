package functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * NoZ - CodingBat Functional-2
 *
 * Given a list of strings, returns a new list omitting
 * any string that contains the letter "z".
 */
public class NoZ {

    /**
     * Filters out strings that contain the character 'z'.
     *
     * @param strings list of strings
     * @return new list excluding strings containing 'z'
     */
    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        NoZ nz = new NoZ();
        List<String> input = java.util.Arrays.asList("apple", "zebra", "orange", "pizza");
        System.out.println(nz.noZ(input)); // → [apple, orange]
    }
}
