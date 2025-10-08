package array2;

/**
 * matchUp - CodingBat Array-2
 *
 * Given arrays nums1 and nums2 of the same length, for every element in nums1,
 * consider the corresponding element in nums2 (at the same index). Return the
 * count of the number of times that the two elements differ by 2 or less, but
 * are not equal.
 */
public class MatchUp {

    /**
     * Counts how many corresponding pairs of numbers differ by 2 or less,
     * but are not equal.
     *
     * @param nums1 the first array
     * @param nums2 the second array
     * @return the count of pairs that meet the condition
     */
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i]) {
                count++;
            }
        }

        return count;
    }

    // Optional: main() for quick testing
    public static void main(String[] args) {
        MatchUp m = new MatchUp();

        System.out.println(m.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10})); // → 2
        System.out.println(m.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));  // → 3
        System.out.println(m.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));  // → 2
    }
}
