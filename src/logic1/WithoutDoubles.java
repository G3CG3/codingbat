package logic1;

/**
 * WithoutDoubles - CodingBat Logic-1
 *
 * Return the sum of two 6-sided dice rolls. If noDoubles is true and the dice are equal,
 * increment one die, wrapping 6 to 1.
 */
public class WithoutDoubles {

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            die1 = die1 == 6 ? 1 : die1 + 1;
        }
        return die1 + die2;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        WithoutDoubles wd = new WithoutDoubles();
        System.out.println(wd.withoutDoubles(2, 3, true));  // 5
        System.out.println(wd.withoutDoubles(3, 3, true));  // 7
        System.out.println(wd.withoutDoubles(6, 6, true));  // 7
        System.out.println(wd.withoutDoubles(6, 6, false)); // 12
    }
}
