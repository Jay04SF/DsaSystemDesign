package DsaSystemDesign.TwoPointer;
import java.util.*;
public class PairSum {
    public static int[] twoSum(int[] number, int target) {
        int left = 0;
        int right = number.length-1;
        while (left < right) {
            if(number[left] + number[right] == target) return new int[]{number[left], number[right]};
            else if (number[left] + number[right] < target) left++;
            else right++;
        }
        return new int[]{-1,-1};
    }
     public static void main(String[] args) {
        int[] numbers = {-1,0};
        int target = -1;
        int[] sol = twoSum(numbers, target);
        System.out.println(Arrays.toString(sol));
    }
}