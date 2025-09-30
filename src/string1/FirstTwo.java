package string1;

/**
 * FirstTwo - CodingBat String-1
 *
 * Given a string, return the string made of its first two chars,
 * so "Hello" yields "He". If the string is shorter than length 2,
 * return whatever there is. If the string is empty, return "".
 */
public class FirstTwo {

    /**
     * Returns the first two characters of the input string.
     *
     * @param str input string
     * @return first two characters, or the whole string if shorter
     */
    public String firstTwo(String str) {
        return (str.length() < 2 ? str : str.substring(0, 2));
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        FirstTwo ft = new FirstTwo();
        System.out.println(ft.firstTwo("Hello")); // He
        System.out.println(ft.firstTwo("X"));     // X
        System.out.println(ft.firstTwo(""));      // ""
    }
}
