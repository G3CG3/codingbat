package string1;

/**
 * WithoutX2 - CodingBat String-1
 *
 * Given a string, if one or both of the first 2 chars is 'x',
 * return the string without those 'x' chars, and otherwise
 * return the string unchanged.
 */
public class WithoutX2 {

    /**
     * Removes 'x' characters from the first two positions of a string,
     * if present. Leaves the rest of the string unchanged.
     *
     * @param str the input string
     * @return string without 'x' in the first two positions
     */
    public String withoutX2(String str) {
        if (str.isEmpty()) return "";
        if (str.length() == 1)
            return (str.charAt(0) == 'x') ? "" : str;

        StringBuilder sb = new StringBuilder();
        if (str.charAt(0) != 'x') sb.append(str.charAt(0));
        if (str.charAt(1) != 'x') sb.append(str.charAt(1));
        sb.append(str.substring(2));

        return sb.toString();
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        WithoutX2 wx = new WithoutX2();
        System.out.println(wx.withoutX2("xHi"));   // Hi
        System.out.println(wx.withoutX2("Hxi"));   // Hi
        System.out.println(wx.withoutX2("Hi"));    // Hi
        System.out.println(wx.withoutX2("xxHi"));  // Hi
        System.out.println(wx.withoutX2("x"));     // ""
        System.out.println(wx.withoutX2(""));      // ""
    }
}
