package warmup1;

/**
 * Front22 - CodingBat Warmup-1
 *
 * Given a string, take the first 2 chars and return the string with
 * the 2 chars added at both the front and back, so "kitten" yields "kikittenki".
 * If the string length is less than 2, use whatever chars are there.
 */
public class Front22 {

    /**
     * Returns the string with its first 2 characters added at both front and back.
     *
     * @param str input string
     * @return string with first 2 chars wrapped around
     */
    public String front22(String str) {
        String front = str.length() < 2 ? str : str.substring(0, 2);
        return front + str + front;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        Front22 f = new Front22();
        System.out.println(f.front22("kitten")); // "kikittenki"
        System.out.println(f.front22("Ha"));     // "HaHaHa"
        System.out.println(f.front22("a"));      // "aaa"
        System.out.println(f.front22(""));       // ""
    }
}
