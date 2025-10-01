package string1;

/**
 * SeeColor - CodingBat String-1
 *
 * Given a string, if the string begins with "red" or "blue" return that color string,
 * otherwise return the empty string.
 */
public class SeeColor {

    /**
     * Returns "red" or "blue" if the string starts with that color, else "".
     *
     * @param str input string
     * @return "red", "blue", or ""
     */
    public String seeColor(String str) {
        if (str.startsWith("red")) return "red";
        if (str.startsWith("blue")) return "blue";
        return "";
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        SeeColor sc = new SeeColor();
        System.out.println(sc.seeColor("redxx"));    // red
        System.out.println(sc.seeColor("blueTimes")); // blue
        System.out.println(sc.seeColor("green"));    // ""
        System.out.println(sc.seeColor(""));         // ""
    }
}
