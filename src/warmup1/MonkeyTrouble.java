package warmup1;

/**
 * MonkeyTrouble - CodingBat Warmup-1
 *
 * We have two monkeys, a and b, and the parameters aSmile and bSmile
 * indicate if each is smiling. We are in trouble if they are both smiling
 * or if neither of them is smiling. Return true if we are in trouble.
 */
public class MonkeyTrouble {

    /**
     * Returns true if we are in trouble with the monkeys.
     *
     * @param aSmile true if monkey a is smiling
     * @param bSmile true if monkey b is smiling
     * @return true if we are in trouble
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MonkeyTrouble m = new MonkeyTrouble();
        System.out.println(m.monkeyTrouble(true, true));   // true
        System.out.println(m.monkeyTrouble(false, false)); // true
        System.out.println(m.monkeyTrouble(true, false));  // false
        System.out.println(m.monkeyTrouble(false, true));  // false
    }
}
