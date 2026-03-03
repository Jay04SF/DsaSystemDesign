package DsaSystemDesign;
import java.util.*;
// Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

// Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

// Return k after placing the final result in the first k slots of nums.

// Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

// Custom Judge:

// The judge will test your solution with the following code:

// int[] nums = [...]; // Input array
// int[] expectedNums = [...]; // The expected answer with correct length

// int k = removeDuplicates(nums); // Calls your implementation

// assert k == expectedNums.length;
// for (int i = 0; i < k; i++) {
//     assert nums[i] == expectedNums[i];
// }
// If all assertions pass, then your solution will be accepted.

 

// Example 1:

// Input: nums = [1,1,1,2,2,3]
// Output: 5, nums = [1,1,2,2,3,_]
// Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).
// Example 2:

// Input: nums = [0,0,1,1,1,1,2,3,3]
// Output: 7, nums = [0,0,1,1,2,3,3,_,_]
// Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).
 
public class PracticeOne {

    public static int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) return new int[]{-1,-1};

        int left = 0;
        int right = numbers.length -1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left+1, right+1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1,-1};
    }
    public static void segregate0and1(int[] arr) {
        // code here
        if(arr == null || arr.length < 2) return;
        int slow = -1;
        int fast = 0;

        while (fast < arr.length) {
            if (arr[fast] == 0) {
                slow++;
                arr[slow] = 0;
            }
            if(slow < fast)
                arr[fast] = 1;
            fast++;
        }
        System.out.println(Arrays.toString(arr));
    }
    // public static int[] removeDuplicates(int[] nums) {
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for (int num : nums) {
    //         if (map.containsKey(num)) map.put(num, map.get(num)+1);
    //         else map.put(num, 1);
    //     }

    //     int[] ans = new int[nums.length];
    //     Arrays.fill(ans, -1);
    //     int itr = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (map.containsKey(nums[i])) {
    //             int times = map.get(nums[i]);
    //             for (int j = 0; j < 2 && j < times; j++) {
    //                 ans[itr] = nums[i];
    //                 itr++;
    //             }
    //             map.remove(nums[i]);
    //         }
    //     }

    //     return ans;
    // }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;

        if (n <= 2)
            return n;

        int j = 2;

        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }

        System.out.println("DEBUG : " + Arrays.toString(nums));
        return j;
    }

    public static int findUnsort(int[] nums) {
        // 2,6,4,8,10,9,15
        int left = 1;
        int right = nums.length-1;

        while (left < nums.length-1 && nums[left - 1] <= nums[left]) {
            left++;
        }

        while (right > 0 && nums[right - 1] <= nums[right]) {
            right--;
        }

        System.out.println(left);
        System.out.println(right);
        if (right - left <= 0) {
            return 0;
        }
        System.out.println(nums.length - (right - left) + 1);
        return nums.length - (right - left) + 1;
    }

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9))); 
        // segregate0and1(new int[]{0, 0, 0, 1, 0});
        int[] duplicates = {2,6,4,8,10,9,15};
        // System.out.println(Arrays.toString(removeDuplicates(duplicates)));
        // System.out.println(Integer.toString(removeDuplicates(duplicates)));
        findUnsort(duplicates);
    }
}
