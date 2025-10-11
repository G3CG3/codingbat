package ap1;

/**
 * WordsFront - CodingBat AP-1
 *
 * Given an array of strings, return a new array containing the first N strings.
 * N will be in the range 1..length of the array.
 */
public class WordsFront {

    /**
     * Returns a new array containing the first N strings from the input array.
     *
     * @param words input array of strings
     * @param n     number of strings to include
     * @return new array of length N containing the first N strings
     */
    public String[] wordsFront(String[] words, int n) {
        String[] result = new String[n];
        System.arraycopy(words, 0, result, 0, n);
        return result;
    }

    // Optional main() for testing
    public static void main(String[] args) {
        WordsFront wf = new WordsFront();

        String[] arr1 = {"a", "b", "c", "d"};
        String[] res1 = wf.wordsFront(arr1, 2); // {"a", "b"}

        for (String s : res1) System.out.print(s + " "); // a b
        System.out.println();

        String[] arr2 = {"hello", "world", "java"};
        String[] res2 = wf.wordsFront(arr2, 3); // {"hello", "world", "java"}

        for (String s : res2) System.out.print(s + " "); // hello world java
        System.out.println();
    }
}
