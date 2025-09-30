package string1;

/**
 * HelloName - CodingBat String-1
 *
 * Given a string name, return a greeting of the form "Hello Bob!".
 */
public class HelloName {

    /**
     * Returns a greeting for the given name.
     *
     * @param name input name
     * @return greeting string
     */
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        HelloName hn = new HelloName();
        System.out.println(hn.helloName("Bob"));   // "Hello Bob!"
        System.out.println(hn.helloName("Alice")); // "Hello Alice!"
        System.out.println(hn.helloName("X"));     // "Hello X!"
    }
}
