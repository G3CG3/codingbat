package logic1;

/**
 * InOrderEqual - CodingBat Logic-1
 *
 * Given three ints, a, b, c, return true if they are in strict increasing order,
 * such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7.
 *
 * However, if the boolean equalOk is true, equality is allowed,
 * such as 5 5 7 or 5 5 5.
 */
public class InOrderEqual {

    /**
     * Determines if the integers are in order, considering the equalOk flag.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @param equalOk if true, allows equality between numbers
     * @return true if the order condition is satisfied
     */
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return (equalOk && a <= b && b <= c) || (a < b && b < c);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        InOrderEqual io = new InOrderEqual();
        System.out.println(io.inOrderEqual(2, 5, 11, false)); // true
        System.out.println(io.inOrderEqual(5, 5, 7, true));   // true
        System.out.println(io.inOrderEqual(5, 5, 7, false));  // false
        System.out.println(io.inOrderEqual(5, 6, 7, false));  // true
    }
}
