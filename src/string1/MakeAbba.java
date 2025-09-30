package string1;

/**
 * MakeAbba - CodingBat String-1
 *
 * Given two strings, a and b, return the result of putting them together
 * in the order abba. For example, "Hi" and "Bye" returns "HiByeByeHi".
 */
public class MakeAbba {

    /**
     * Returns the concatenation of two strings in abba order.
     *
     * @param a first string
     * @param b second string
     * @return concatenated string in abba order
     */
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    // Optional: main() for testing
    public static void main(String[] args) {
        MakeAbba ma = new MakeAbba();
        System.out.println(ma.makeAbba("Hi", "Bye"));   // "HiByeByeHi"
        System.out.println(ma.makeAbba("Yo", "Alice")); // "YoAliceAliceYo"
        System.out.println(ma.makeAbba("What", "Up"));  // "WhatUpUpWhat"
    }
}
