package warmup2;

/**
 * CountXX - CodingBat Warmup-2
 *
 * Count the number of "xx" in the given string. Overlapping is allowed, so "xxx" contains 2 "xx".
 */
public class CountXX {

    /**
     * Counts the number of "xx" substrings in the input string (overlapping allowed).
     *
     * @param str input string
     * @return number of "xx" occurrences
     */
    public int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                count++;
            }
        }
        return count;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CountXX cx = new CountXX();
        System.out.println(cx.countXX("abcxx"));    // 1
        System.out.println(cx.countXX("xxx"));      // 2
        System.out.println(cx.countXX("xxxx"));     // 3
        System.out.println(cx.countXX("abc"));      // 0
    }
}
