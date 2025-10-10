package string3;

/**
 * equalIsNot - CodingBat String-3
 *
 * Given a string, return true if the number of appearances of "is" anywhere
 * in the string is equal to the number of appearances of "not" anywhere
 * in the string (case sensitive).
 */
public class EqualIsNot {

    public boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;
        int i = 0;

        while (i < str.length()) {
            if (i + 2 <= str.length() && str.startsWith("is", i)) {
                isCount++;
                i += 2;
            } else if (i + 3 <= str.length() && str.startsWith("not", i)) {
                notCount++;
                i += 3;
            } else {
                i++;
            }
        }
        return isCount == notCount;
    }

    public static void main(String[] args) {
        EqualIsNot test = new EqualIsNot();

        System.out.println(test.equalIsNot("This is not"));         // → false
        System.out.println(test.equalIsNot("This is notnot"));      // → true
        System.out.println(test.equalIsNot("noisxxnotyynotxisi"));  // → true
        System.out.println(test.equalIsNot("isnotis"));             // → false
        System.out.println(test.equalIsNot("isxxnotyynotxisi"));    // → true
    }
}
