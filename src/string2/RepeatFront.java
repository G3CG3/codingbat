package string2;

/**
 * RepeatFront - CodingBat String-2
 *
 * Given a string and an int n, return a string made of the first n characters
 * of the string, followed by the first n-1 characters, and so on.
 */
public class RepeatFront {

    public String repeatFront(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            sb.append(str, 0, i);
        }
        return sb.toString();
    }

    // Optional main for testing
    public static void main(String[] args) {
        RepeatFront rf = new RepeatFront();
        System.out.println(rf.repeatFront("Chocolate", 4)); // ChocChoChC
        System.out.println(rf.repeatFront("Hello", 3)); // HelHeH
        System.out.println(rf.repeatFront("ab", 2)); // ab a
    }
}
