package warmup1;

/**
 * Front3 - CodingBat Warmup-1
 *
 * Given a string, we'll say that the front is the first 3 chars of the string.
 * If the string length is less than 3, the front is whatever is there.
 * Return a new string which is 3 copies of the front.
 */
public class Front3 {

    /**
     * Returns a new string made of 3 copies of the front of the string.
     *
     * @param str input string
     * @return string with 3 copies of the front
     */
    public String front3(String str) {
        String front = str.length() < 3 ? str : str.substring(0, 3);
        return front + front + front;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Front3 f = new Front3();
        System.out.println(f.front3("Java"));   // "JavJavJav"
        System.out.println(f.front3("Chocolate")); // "ChoChoCho"
        System.out.println(f.front3("ab"));     // "ababab"
        System.out.println(f.front3("x"));      // "xxx"
    }
}
