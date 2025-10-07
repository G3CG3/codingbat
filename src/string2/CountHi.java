package string2;

/**
 * CountHi - CodingBat String-2
 *
 * Given a string, return the number of times that the string "hi" appears anywhere in the string.
 *
 * Examples:
 * countHi("abc hi ho") → 1
 * countHi("ABChi hi") → 2
 * countHi("hihi") → 2
 */
public class CountHi {

    /**
     * Counts how many times "hi" appears in the input string.
     *
     * @param str the input string
     * @return the count of "hi" substrings
     */
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("hi", i)) {
                count++;
            }
        }
        return count;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CountHi ch = new CountHi();
        System.out.println(ch.countHi("abc hi ho")); // 1
        System.out.println(ch.countHi("ABChi hi"));  // 2
        System.out.println(ch.countHi("hihi"));      // 2
    }
}
