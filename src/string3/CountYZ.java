package string3;

/**
 * countYZ - CodingBat String-3
 *
 * Given a string, count the number of words ending in 'y' or 'z' --
 * the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y'
 * in "yellow" (not case sensitive). We'll say that a y or z is at the end
 * of a word if there is not an alphabetic letter immediately following it.
 *
 * Note: Character.isLetter(char) checks if a char is an alphabetic letter.
 */
public class CountYZ {

    public int countYZ(String str) {
        str = str.toLowerCase(); // make it case-insensitive
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if ((c == 'y' || c == 'z') &&
                    (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountYZ test = new CountYZ();

        System.out.println(test.countYZ("fez day"));      // → 2
        System.out.println(test.countYZ("day fez"));      // → 2
        System.out.println(test.countYZ("day fyyyz"));    // → 2
        System.out.println(test.countYZ("yellow crazy")); // → 1
        System.out.println(test.countYZ("lazyZ Zany"));   // → 2
    }
}
