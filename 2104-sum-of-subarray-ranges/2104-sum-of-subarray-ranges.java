import java.util.*;

class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        
        long minSum = sumOfMins(nums, n);
        long maxSum = sumOfMaxs(nums, n);
        
        return maxSum - minSum;
    }
    private long sumOfMins(int[] nums, int n) {
        Stack<Integer> st = new Stack<>();
        long sum = 0;
        
        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || nums[st.peek()] >= nums[i])) {
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;
                
                long leftCount = mid - left;
                long rightCount = right - mid;
                
                sum += (long) nums[mid] * leftCount * rightCount;
            }
            st.push(i);
        }
        return sum;
    }
    private long sumOfMaxs(int[] nums, int n) {
        Stack<Integer> st = new Stack<>();
        long sum = 0;
        
        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || nums[st.peek()] <= nums[i])) {
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;
                
                long leftCount = mid - left;
                long rightCount = right - mid;
                
                sum += (long) nums[mid] * leftCount * rightCount;
            }
            st.push(i);
        }
        return sum;
    }
}
