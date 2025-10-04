package logic1;

/**
 * TwoAsOne - CodingBat Logic-1
 *
 * Given three ints, a, b, and c, return true if it is possible
 * to add two of the ints to get the third.
 */
public class TwoAsOne {

    /**
     * Checks if the sum of any two numbers equals the third.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return true if any two add up to the third, false otherwise
     */
    public boolean twoAsOne(int a, int b, int c) {
        return (a + b == c || a + c == b || b + c == a);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        TwoAsOne obj = new TwoAsOne();
        System.out.println(obj.twoAsOne(1, 2, 3));   // true
        System.out.println(obj.twoAsOne(3, 1, 2));   // true
        System.out.println(obj.twoAsOne(3, 2, 2));   // false
    }
}
