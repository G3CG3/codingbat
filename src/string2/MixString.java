package string2;

/**
 * MixString - CodingBat String-2
 *
 * Given two strings, a and b, create a bigger string made of the first char of a,
 * the first char of b, the second char of a, the second char of b, and so on.
 * Any leftover chars go at the end of the result.
 */
public class MixString {

    public String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int maxLen = Math.max(a.length(), b.length());

        for (int i = 0; i < maxLen; i++) {
            if (i < a.length()) sb.append(a.charAt(i));
            if (i < b.length()) sb.append(b.charAt(i));
        }

        return sb.toString();
    }

    // Optional main for testing
    public static void main(String[] args) {
        MixString mx = new MixString();
        System.out.println(mx.mixString("abc", "XYZ"));  // AXBYCZ
        System.out.println(mx.mixString("Hi", "There")); // HTiher
        System.out.println(mx.mixString("xxxx", "There")); // xTxhxexre
    }
}
