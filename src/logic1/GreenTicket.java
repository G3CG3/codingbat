package logic1;

/**
 * GreenTicket - CodingBat Logic-1
 *
 * Given a green lottery ticket showing ints a, b, c:
 * - If all numbers are different, return 0.
 * - If all numbers are the same, return 20.
 * - If exactly two numbers are the same, return 10.
 */
public class GreenTicket {

    public int greenTicket(int a, int b, int c) {
        if (a != b && b != c && a != c) return 0;
        if (a == b && b == c) return 20;
        return 10;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        GreenTicket gt = new GreenTicket();
        System.out.println(gt.greenTicket(1, 2, 3)); // 0
        System.out.println(gt.greenTicket(2, 2, 2)); // 20
        System.out.println(gt.greenTicket(1, 1, 2)); // 10
        System.out.println(gt.greenTicket(2, 3, 2)); // 10
    }
}
