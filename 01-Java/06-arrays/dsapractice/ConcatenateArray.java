package dsapractice;

import challenges.PrintArray;

public class ConcatenateArray {
    public static void main(String[] args) {
        /*
         * You are given an integer array nums of length n. Create an array ans of
         * length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n
         * (0-indexed).
         * 
         * Specifically, ans is the concatenation of two nums arrays.
         * 
         * Return the array ans.
         * 
         * Example 1:
         * 
         * Input: nums = [1,4,1,2]
         * 
         * Output: [1,4,1,2,1,4,1,2]
         */

        int [] nums = {1, 4, 1, 2};
        PrintArray.print1D(getConcatenation(nums));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        
        int ans[] = new int[2 * n];
        for (int i = 0; i < ans.length; i++) {
            if (i >= n) {
                ans[i] = nums[i - n];
            } else {
                ans[i] = nums[i];
            }
        }
        return ans;
    }
}
