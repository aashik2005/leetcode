class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;

        int[] dp = new int[n + 1]; 

        for (int i = n - 1; i >= 0; i--) {
            int maxi = 0;
            int maxSum = 0;

            for (int j = 1; j <= k && i + j <= n; j++) {
                maxi = Math.max(maxi, arr[i + j - 1]);
                int currentSum = maxi * j + dp[i + j];

                maxSum = Math.max(maxSum, currentSum);
            }

            dp[i] = maxSum;
        }

        return dp[0];
    }
}