package string3;

/**
 * withoutString - CodingBat String-3
 *
 * Given two strings, base and remove, return a version of the base string
 * where all instances of the remove string have been removed (not case sensitive).
 * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
 */
public class WithoutString {

    public String withoutString(String base, String remove) {
        String baseLower = base.toLowerCase();
        String removeLower = remove.toLowerCase();
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < base.length()) {
            if (i <= base.length() - remove.length() &&
                    baseLower.substring(i, i + remove.length()).equals(removeLower)) {
                i += remove.length(); // skip the removed substring
            } else {
                result.append(base.charAt(i));
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        WithoutString test = new WithoutString();

        System.out.println(test.withoutString("Hello there", "llo"));   // → "He there"
        System.out.println(test.withoutString("Hello there", "e"));     // → "Hllo thr"
        System.out.println(test.withoutString("Hello there", "x"));     // → "Hello there"
        System.out.println(test.withoutString("xxx", "xx"));            // → "x"
        System.out.println(test.withoutString("AbCaBc", "abc"));        // → ""
    }
}
