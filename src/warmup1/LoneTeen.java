package warmup1;

/**
 * LoneTeen - CodingBat Warmup-1
 *
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 2 int values, return true if one or the other is teen, but not both.
 */
public class LoneTeen {

    /**
     * Returns true if exactly one of the two integers is a teen (13..19 inclusive).
     *
     * @param a first integer
     * @param b second integer
     * @return true if exactly one is a teen
     */
    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return aTeen ^ bTeen;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        LoneTeen lt = new LoneTeen();
        System.out.println(lt.loneTeen(13, 99)); // true
        System.out.println(lt.loneTeen(21, 19)); // true
        System.out.println(lt.loneTeen(13, 13)); // false
        System.out.println(lt.loneTeen(20, 20)); // false
    }
}
