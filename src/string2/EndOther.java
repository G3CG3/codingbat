package string2;

/**
 * EndOther - CodingBat String-2
 *
 * Given two strings, return true if either of the strings appears at the very end
 * of the other string, ignoring upper/lower case differences.
 *
 * Examples:
 * endOther("Hiabc", "abc") → true
 * endOther("AbC", "HiaBc") → true
 * endOther("abc", "abXabc") → true
 */
public class EndOther {

    /**
     * Checks if one string appears at the end of the other, case-insensitive.
     *
     * @param a first string
     * @param b second string
     * @return true if either string appears at the end of the other
     */
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        return a.endsWith(b) || b.endsWith(a);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        EndOther eo = new EndOther();
        System.out.println(eo.endOther("Hiabc", "abc"));    // true
        System.out.println(eo.endOther("AbC", "HiaBc"));    // true
        System.out.println(eo.endOther("abc", "abXabc"));   // true
        System.out.println(eo.endOther("abc", "xyz"));      // false
    }
}
