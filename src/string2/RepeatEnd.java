package string2;

/**
 * RepeatEnd - CodingBat String-2
 *
 * Given a string and an int n, return a string made of n repetitions of
 * the last n characters of the string. Assume n is between 0 and the length of the string.
 */
public class RepeatEnd {

    public String repeatEnd(String str, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(str.substring(str.length() - n));
        }

        return sb.toString();
    }

    // Optional main for testing
    public static void main(String[] args) {
        RepeatEnd re = new RepeatEnd();
        System.out.println(re.repeatEnd("Hello", 3)); // lolo
        System.out.println(re.repeatEnd("Chocolate", 4)); // lateLateLateLate
        System.out.println(re.repeatEnd("ab", 2)); // abab
    }
}
