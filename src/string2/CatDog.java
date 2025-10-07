package string2;

/**
 * CatDog - CodingBat String-2
 *
 * Given a string, return true if the strings "cat" and "dog" appear the same number of times in the string.
 *
 * Examples:
 * catDog("catdog") → true
 * catDog("catcat") → false
 * catDog("1cat1cadodog") → true
 */
public class CatDog {

    /**
     * Checks if "cat" and "dog" appear the same number of times.
     *
     * @param str the input string
     * @return true if "cat" and "dog" appear the same number of times
     */
    public boolean catDog(String str) {
        int countC = 0;
        int countD = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("cat", i)) countC++;
            if (str.startsWith("dog", i)) countD++;
        }
        return countC == countD;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        CatDog cd = new CatDog();
        System.out.println(cd.catDog("catdog"));      // true
        System.out.println(cd.catDog("catcat"));      // false
        System.out.println(cd.catDog("1cat1cadodog"));// true
    }
}
