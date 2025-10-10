package string3;

/**
 * gHappy - CodingBat String-3
 *
 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
 * immediately to its left or right. Return true if all the g's in the given string are happy.
 */
public class GHappy {

    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean left = i > 0 && str.charAt(i - 1) == 'g';
                boolean right = i < str.length() - 1 && str.charAt(i + 1) == 'g';
                if (!left && !right) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        GHappy test = new GHappy();

        System.out.println(test.gHappy("xxggxx"));     // → true
        System.out.println(test.gHappy("xxgxx"));      // → false
        System.out.println(test.gHappy("xxggyygxx"));  // → false
        System.out.println(test.gHappy("ggg"));        // → true
        System.out.println(test.gHappy("g"));          // → false
    }
}
