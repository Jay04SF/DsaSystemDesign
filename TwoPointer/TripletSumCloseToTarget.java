package DsaSystemDesign.TwoPointer;
import java.util.*;

public class TripletSumCloseToTarget {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            closestSum = twoSum(nums, i, target, closestSum);
            if (closestSum == target) return target;
        }
        return closestSum;
    }

    private static int twoSum(int[] nums, int i, int target, int closestSum) {
        int left = i + 1, right = nums.length - 1;

        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                closestSum = sum;
            }

            if (sum == target) return sum;
            else if (sum < target) left++;
            else right--;
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[] numbers = { -2, 0, 1, 2 };
        int target = 2;
        System.out.println(threeSumClosest(numbers, target)); // 1
    }
}