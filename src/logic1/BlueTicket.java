package logic1;

/**
 * BlueTicket - CodingBat Logic-1
 *
 * Given a blue lottery ticket showing ints a, b, c:
 * - Consider the sums of pairs: ab, bc, ac.
 * - If any pair sums to exactly 10, return 10.
 * - Otherwise, if ab is exactly 10 more than bc or ac, return 5.
 * - Otherwise, return 0.
 */
public class BlueTicket {

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || ac == 10 || bc == 10) return 10;
        if (ab - 10 == bc || ab - 10 == ac) return 5;
        return 0;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        BlueTicket bt = new BlueTicket();
        System.out.println(bt.blueTicket(9, 1, 0)); // 10
        System.out.println(bt.blueTicket(9, 1, 1)); // 5
        System.out.println(bt.blueTicket(5, 5, 1)); // 10
        System.out.println(bt.blueTicket(1, 2, 3)); // 0
    }
}
