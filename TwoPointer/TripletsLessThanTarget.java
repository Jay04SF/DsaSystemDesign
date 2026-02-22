package DsaSystemDesign.TwoPointer;

import java.util.*;

public class TripletsLessThanTarget {

    // find all triplet where it is less then target.
    public static long tripletSumLessThanTraget(int[] nums, int target) {
        Arrays.sort(nums);
        long ans = 0;

        for (int i = 0; i < nums.length -2; i++) {
            int left = i + 1;
            int right = nums.length-1;

            while (left < right) {
                long sum = nums[i] + nums[left] + nums[right];

                if (sum >= target) {
                    right--;
                } else {    
                    ans += right - left;
                    left++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {30, 8, 23, 6, 10, 9, 31, 7, 19, 20, 1, 33, 21, 27, 28, 3, 25, 26};
        int target = 86;
        System.out.println(tripletSumLessThanTraget(nums, target));
    }
}
