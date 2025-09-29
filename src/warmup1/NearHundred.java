package warmup1;

/**
 * NearHundred - CodingBat Warmup-1
 *
 * Given an int n, return true if it is within 10 of 100 or 200.
 * Note: Math.abs(num) computes the absolute value of a number.
 */
public class NearHundred {

    /**
     * Returns true if n is within 10 of 100 or 200.
     *
     * @param n integer value
     * @return true if n is within 10 of 100 or 200
     */
    public boolean nearHundred(int n) {
        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        NearHundred nh = new NearHundred();
        System.out.println(nh.nearHundred(93));  // true
        System.out.println(nh.nearHundred(90));  // true
        System.out.println(nh.nearHundred(89));  // false
        System.out.println(nh.nearHundred(210)); // true
        System.out.println(nh.nearHundred(211)); // false
    }
}
