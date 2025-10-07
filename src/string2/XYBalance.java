package string2;

/**
 * XYBalance - CodingBat String-2
 *
 * We'll say that a String is xy-balanced if for all the 'x' chars in the string,
 * there exists a 'y' char somewhere later in the string.
 * One 'y' can balance multiple 'x's.
 */
public class XYBalance {

    /**
     * Checks if a string is xy-balanced.
     *
     * @param str input string
     * @return true if xy-balanced
     */
    public boolean xyBalance(String str) {
        int lastX = str.lastIndexOf('x');
        int lastY = str.lastIndexOf('y');
        return lastX <= lastY;
    }

    // Optional main for testing
    public static void main(String[] args) {
        XYBalance xy = new XYBalance();
        System.out.println(xy.xyBalance("xxy"));   // true
        System.out.println(xy.xyBalance("xyx"));   // false
        System.out.println(xy.xyBalance("xx"));    // false
        System.out.println(xy.xyBalance("y"));     // true
    }
}
