package string1;

/**
 * NTwice - CodingBat String-1
 *
 * Given a string and an int n, return a string made of the first and last n chars from the string.
 * The string length will be at least n.
 */
public class NTwice {

    /**
     * Returns a string made of the first and last n characters.
     *
     * @param str input string (length ≥ n)
     * @param n   number of characters to take from start and end
     * @return concatenated string of first n and last n characters
     */
    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        NTwice nt = new NTwice();
        System.out.println(nt.nTwice("Hello", 2)); // Helo
        System.out.println(nt.nTwice("Chocolate", 3)); // Choate
        System.out.println(nt.nTwice("java", 1)); // ja
    }
}
