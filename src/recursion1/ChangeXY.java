package recursion1;

/**
 * ChangeXY - CodingBat Recursion-1
 *
 * Recursively changes all lowercase 'x' characters to 'y' in a string.
 */
public class ChangeXY {

    /**
     * Recursively replaces all 'x' with 'y' in the input string.
     *
     * @param str input string
     * @return new string with 'x' replaced by 'y'
     */
    public String changeXY(String str) {
        if (str.isEmpty()) return str; // Base case: empty string

        if (str.charAt(0) == 'x') {
            return "y" + changeXY(str.substring(1)); // Replace 'x' and recurse
        } else {
            return str.charAt(0) + changeXY(str.substring(1)); // Keep char and recurse
        }
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        ChangeXY cy = new ChangeXY();
        System.out.println(cy.changeXY("codex"));      // codey
        System.out.println(cy.changeXY("xxhixx"));     // yyhiyy
        System.out.println(cy.changeXY("hello"));      // hello
        System.out.println(cy.changeXY("xoxo"));       // yoyo
    }
}
