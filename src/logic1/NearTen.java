package logic1;

/**
 * NearTen - CodingBat Logic-1
 *
 * Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
 * Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
 */
public class NearTen {

    /**
     * Returns true if num is within 2 of a multiple of 10.
     *
     * @param num a non-negative integer
     * @return true if num is within 2 of a multiple of 10
     */
    public boolean nearTen(int num) {
        return (num % 10 <= 2 || num % 10 >= 8);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        NearTen nt = new NearTen();
        System.out.println(nt.nearTen(12)); // true
        System.out.println(nt.nearTen(17)); // false
        System.out.println(nt.nearTen(19)); // true
        System.out.println(nt.nearTen(20)); // true
        System.out.println(nt.nearTen(23)); // true
        System.out.println(nt.nearTen(28)); // true
        System.out.println(nt.nearTen(30)); // true
        System.out.println(nt.nearTen(31)); // true
    }
}
