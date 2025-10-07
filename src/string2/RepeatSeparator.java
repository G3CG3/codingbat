package string2;

/**
 * RepeatSeparator - CodingBat String-2
 *
 * Given two strings, word and a separator sep, return a big string made of
 * count occurrences of the word, separated by the separator string.
 */
public class RepeatSeparator {

    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) return "";

        StringBuilder sb = new StringBuilder();
        sb.append(word);

        for (int i = 0; i < count - 1; i++) {
            sb.append(sep).append(word);
        }
        return sb.toString();
    }

    // Optional main for quick testing
    public static void main(String[] args) {
        RepeatSeparator rs = new RepeatSeparator();
        System.out.println(rs.repeatSeparator("Word", "X", 3)); // WordXWordXWord
        System.out.println(rs.repeatSeparator("Hi", "-=", 2)); // Hi-=Hi
        System.out.println(rs.repeatSeparator("Yo", "Yo", 1)); // Yo
    }
}
