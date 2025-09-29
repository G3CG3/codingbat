package warmup1;

/**
 * IcyHot - CodingBat Warmup-1
 *
 * Given two temperatures, return true if one is less than 0
 * and the other is greater than 100.
 */
public class IcyHot {

    /**
     * Checks if one temperature is below 0 and the other is above 100.
     *
     * @param temp1 first temperature
     * @param temp2 second temperature
     * @return true if one < 0 and the other > 100
     */
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        IcyHot ih = new IcyHot();
        System.out.println(ih.icyHot(120, -1));  // true
        System.out.println(ih.icyHot(-1, 120));  // true
        System.out.println(ih.icyHot(2, 120));   // false
        System.out.println(ih.icyHot(-1, 100));  // false
    }
}
