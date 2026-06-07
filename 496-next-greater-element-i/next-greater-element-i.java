import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Map to store the next greater element for each number in nums2
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Iterate through nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];

            // Pop elements from the stack that are smaller than or equal to the current number
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }

            // If the stack is not empty, the top element is the next greater element
            if (!stack.isEmpty()) {
                nextGreaterMap.put(num, stack.peek());
            } else {
                nextGreaterMap.put(num, -1);
            }

            // Push the current number onto the stack
            stack.push(num);
        }

        // Build the answer array for nums1 using the map
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreaterMap.get(nums1[i]);
        }

        return ans;
    }
}