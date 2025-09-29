package warmup1;

/**
 * MixStart - CodingBat Warmup-1
 *
 * Return true if the given string begins with "mix",
 * except the 'm' can be anything, so "pix", "9ix" .. all count.
 */
public class MixStart {

    /**
     * Checks if a string has "ix" starting at index 1.
     *
     * @param str input string
     * @return true if str has "ix" at index 1
     */
    public boolean mixStart(String str) {
        return str.length() >= 3 && str.startsWith("ix", 1);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MixStart ms = new MixStart();
        System.out.println(ms.mixStart("mix"));   // true
        System.out.println(ms.mixStart("pix"));   // true
        System.out.println(ms.mixStart("9ix"));   // true
        System.out.println(ms.mixStart("mIx"));   // false
        System.out.println(ms.mixStart("mi"));    // false
    }
}
