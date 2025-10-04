package logic1;

/**
 * ShareDigit - CodingBat Logic-1
 *
 * Given two ints a and b, each in the range 10..99:
 * Return true if there is a digit that appears in both numbers.
 * Use division (/) and modulo (%) to extract digits.
 */
public class ShareDigit {

    public boolean shareDigit(int a, int b) {
        int firstDigitA = a / 10;
        int firstDigitB = b / 10;
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;

        return (firstDigitA == firstDigitB || firstDigitA == lastDigitB ||
                lastDigitA == firstDigitB || lastDigitA == lastDigitB);
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        ShareDigit sd = new ShareDigit();
        System.out.println(sd.shareDigit(12, 23)); // true
        System.out.println(sd.shareDigit(12, 43)); // false
        System.out.println(sd.shareDigit(19, 91)); // true
        System.out.println(sd.shareDigit(55, 55)); // true
    }
}
