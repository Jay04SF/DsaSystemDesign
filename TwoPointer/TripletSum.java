package DsaSystemDesign.TwoPointer;
import java.util.*;

public class TripletSum {

    public static List<List<Integer>> threeSum(int[] nums) {// O(n^2) : TC | O(n) : SC
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            ArrayList<ArrayList<Integer>> twoSum = uniquePairsSum(nums, -nums[i], i+1, nums.length-1);
            if (twoSum != null && twoSum.size() != 0) {
                for (ArrayList<Integer> pair : twoSum) {
                    pair.add(nums[i]);
                    ans.add(pair);
                }
                while (i < nums.length-1 && nums[i] == nums[i+1]) {// ignore the duplication finding again
                    i++;
                }
            }
        }
        return ans;
    }
    
    public static ArrayList<ArrayList<Integer>> uniquePairsSum(int[] numbers, int target, int left, int right) {// pattern variation
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(numbers[left]);
                pair.add(numbers[right]);
                ans.add(pair);
                left++;
                right--;
                // Skip duplicates for left pointer
                while (left < right && numbers[left] == numbers[left - 1]) 
                    left++;
                // Skip duplicates for right pointer
                while (left < right && numbers[right] == numbers[right + 1]) 
                    right--;
            } else if (sum < target) left++;
            else right--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }    
}
