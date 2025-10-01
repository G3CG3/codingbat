package string1;

/**
 * WithoutX - CodingBat String-1
 *
 * Given a string, if the first or last chars are 'x', return the string
 * without those 'x' chars. Otherwise return the string unchanged.
 */
public class WithoutX {

    /**
     * Removes 'x' from start and/or end of string if present.
     *
     * @param str the input string
     * @return the string without leading/trailing 'x'
     */
    public String withoutX(String str) {
        if (str.isEmpty()) return "";

        int start = (str.charAt(0) == 'x') ? 1 : 0;
        int end = (str.charAt(str.length() - 1) == 'x') ? str.length() - 1 : str.length();

        // ensure indices are valid
        if (start > end) return "";
        return str.substring(start, end);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        WithoutX wx = new WithoutX();
        System.out.println(wx.withoutX("xHix"));  // "Hi"
        System.out.println(wx.withoutX("xHi"));   // "Hi"
        System.out.println(wx.withoutX("Hx"));    // "H"
        System.out.println(wx.withoutX("Hi"));    // "Hi"
        System.out.println(wx.withoutX("x"));     // ""
        System.out.println(wx.withoutX(""));      // ""
    }
}
