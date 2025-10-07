package string2;

/**
 * getSandwich - CodingBat String-2
 *
 * Given a string, returns the string between the first and last
 * occurrence of "bread". If there are not two pieces of bread, returns "".
 */
public class GetSandwich {

    /**
     * Returns the string between the first and last "bread".
     *
     * @param str the input string
     * @return substring between first and last "bread", or "" if not found
     */
    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if (first == -1 || last == -1 || first == last) return "";

        return str.substring(first + 5, last);
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        GetSandwich gs = new GetSandwich();
        System.out.println(gs.getSandwich("breadjambread"));      // jam
        System.out.println(gs.getSandwich("xxbreadjambreadyy"));  // jam
        System.out.println(gs.getSandwich("breadbread"));         // ""
        System.out.println(gs.getSandwich("breaxbreadybread"));   // xbready
    }
}
