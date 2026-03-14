package DsaSystemDesign.SlidingWindow;
import java.util.*;

public class AdityaVermaSlidingWindow {
    
    public static int maxSubArraySumOfKSizeWindow(int[] nums, int k) {
        int low = 0, high = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        while (high < nums.length) {
            sum += nums[high];
            if (high - low + 1 < k) {
                high++;
            }
            else if (high - low + 1 == k) {
                maxSum = Math.max(maxSum, sum);

                // remove nums[low] and move low to slide window
                sum -= nums[low];
                low++;
                high++;
            }
        }

        return maxSum;
    }
    // GFG : https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
    public static ArrayList<Integer> firstNegNumForKSizeWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int low = 0;
        int high = 0;
        while (high < nums.length) {
            if (high - low + 1 < k) {
                if (nums[high] < 0) {
                    q.add(nums[high]);
                }
                high++;
            } else if (high - low + 1 == k) {
                if (nums[high] < 0) {
                    q.add(nums[high]);
                }
                if (q.size() > 0) {// this means we have the negative in window.
                    list.add(q.peek());
                } else {// this means we have no negative number.
                    list.add(0); 
                }
                if (nums[low] < 0) {
                    q.poll();
                }
                high++;
                low++;
            }
        }
        return list;
    }

    public static int countOccurenceOfAnagrams(String str, String pattern) {
        int high = 0, low = 0, count = 0;
        HashMap<Character, Integer> windowMap = new HashMap<>();
        HashMap<Character, Integer> ptnFrequencyMap = new HashMap<>();
        
        for (Character ch : pattern.toCharArray()) {
            if (ptnFrequencyMap.containsKey(ch)) 
                ptnFrequencyMap.put(ch, ptnFrequencyMap.get(ch) +1);
            else
                ptnFrequencyMap.put(ch, 0);
        }

        while (high < str.length()) {
            char charFrontWindow = str.charAt(high);
            char charBackWindow = str.charAt(low);

            if (high - low + 1 < pattern.length()) {
                if (windowMap.containsKey(charFrontWindow)) {
                    windowMap.put(charFrontWindow, windowMap.get(charFrontWindow) + 1);
                } else {
                    windowMap.put(charFrontWindow, 0);
                }
                high++;
            } else if (high - low + 1 == pattern.length()) {
                if (windowMap.containsKey(charFrontWindow)) {
                    windowMap.put(charFrontWindow, windowMap.get(charFrontWindow) + 1);
                } else {
                    windowMap.put(charFrontWindow, 0);
                }
                
                if (windowMap.equals(ptnFrequencyMap)) {
                    count++;
                } 

                if (windowMap.get(charBackWindow) == 0) {
                    windowMap.remove(charBackWindow);
                } else {
                    windowMap.put(charBackWindow, windowMap.get(charBackWindow)-1);
                }

                high++;
                low++;
            }
        }

        return count;
    }

    // 239. Sliding Window Maximum
    // https://leetcode.com/problems/sliding-window-maximum/description/
    // brutforce is n^2 where u check max by iterating entire window.
    // un-optimize is nlogn where priority queue insert operation takes logn.
    // optimize deque is that O(n) space O(k).
    public static ArrayList<Integer> maxSubArrays(int[] nums, int k) {
        ArrayList<Integer> sol = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();

        int low = 0, high = 0;
        while (high < nums.length) {
            if (high - low + 1 < k) {
                while (!q.isEmpty() && q.peekLast() < nums[high]) {
                    q.pollLast();
                }
                q.addLast(nums[high]);
                high++;
            } else if (high - low + 1 == k) {
                while (!q.isEmpty() && q.peekLast() < nums[high]) {
                    q.pollLast();
                }
                q.addLast(nums[high]);
                
                if (!q.isEmpty()) {
                    sol.add(q.peekFirst());
                    if (q.peekFirst() == nums[low]) {
                        q.pollFirst();
                    }
                } 
                high++;
                low++;
            }
        }

        return sol;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 3, 5, 2, 1, 4};
        int[] nums2 = {1, 0, 2, 3, -7, 10, 1, 1, 1};
        int[] nums3 = {1, 3, -2, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(maxSubArraySumOfKSizeWindow(nums, 3));
        System.out.println(firstNegNumForKSizeWindow(nums2, 3));
        System.out.println(countOccurenceOfAnagrams("cbaebabacd", "abc"));
        System.out.println(maxSubArrays(nums3, k));
    }
}