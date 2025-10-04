package logic1;

/**
 * RedTicket - CodingBat Logic-1
 *
 * Given a red lottery ticket showing ints a, b, c (0, 1, or 2):
 * - If all are 2, return 10.
 * - Else if all are the same, return 5.
 * - Else if both b and c are different from a, return 1.
 * - Otherwise, return 0.
 */
public class RedTicket {

    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) return 10;
        if (a == b && b == c) return 5;
        if (a != b && a != c) return 1;
        return 0;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        RedTicket rt = new RedTicket();
        System.out.println(rt.redTicket(2, 2, 2)); // 10
        System.out.println(rt.redTicket(1, 1, 1)); // 5
        System.out.println(rt.redTicket(0, 1, 2)); // 1
        System.out.println(rt.redTicket(1, 1, 2)); // 0
    }
}
