package DsaSystemDesign.TwoPointer;
import java.util.*;
public class TwoPointer {

    public static int[] pairSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while (left < right) {
            if (numbers[left] == numbers[right]) return new int[]{numbers[left], numbers[right]}; 
            else if (numbers[left] + numbers[right] < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }
    public static ArrayList<ArrayList<Integer>> findAllPairsSum(int[] numbers, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int left = 0;
        int right = numbers.length -1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(numbers[left]);
                pair.add(numbers[right]);
                ans.add(pair);
                left++;
                right--;
            } else if (sum < target) left++;
            else right--;
        }
        return ans;
    }
    public static ArrayList<ArrayList<Integer>> uniquePairsSum(int[] numbers, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int left = 0;
        int right = numbers.length -1;
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
        System.out.print(Arrays.toString(pairSum(new int[]{1, 2, 3, 4, 5, 6}, 7)));
        System.out.print(findAllPairsSum(new int[]{1, 2, 3, 4, 5, 6}, 7));
        System.out.print(uniquePairsSum(new int[]{-2,-2,-1,-1,-1,-1,0,1,1,1,2}, 0));
    }
}
