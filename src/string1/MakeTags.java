package string1;

/**
 * MakeTags - CodingBat String-1
 *
 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
 * In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
 * Given tag and word strings, create the HTML string with tags around the word,
 * e.g. "<i>Yay</i>".
 */
public class MakeTags {

    /**
     * Returns an HTML string with the given tag surrounding the word.
     *
     * @param tag  the HTML tag (without angle brackets)
     * @param word the word to wrap
     * @return HTML string in the form <tag>word</tag>
     */
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MakeTags mt = new MakeTags();
        System.out.println(mt.makeTags("i", "Yay"));     // <i>Yay</i>
        System.out.println(mt.makeTags("cite", "Hello")); // <cite>Hello</cite>
    }
}
