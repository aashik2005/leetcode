class Solution {
    public int maximumAmount(int[][] coins) {
        int R = coins.length;
        int C = coins[0].length;

        int[][][] dp = new int[R][C][3];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                for (int k = 0; k < 3; k++) {
                    dp[r][c][k] = Integer.MIN_VALUE;
                }
            }
        }
        if (coins[0][0] >= 0) {
            for (int k = 0; k < 3; k++) {
                dp[0][0][k] = coins[0][0];
            }
        } else {
            dp[0][0][0] = coins[0][0];
            dp[0][0][1] = 0;
            dp[0][0][2] = 0;
        }

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (r == 0 && c == 0) continue;

                for (int k = 0; k < 3; k++) {

                    int bestPrev = Integer.MIN_VALUE;

                    if (r > 0) bestPrev = Math.max(bestPrev, dp[r - 1][c][k]);
                    if (c > 0) bestPrev = Math.max(bestPrev, dp[r][c - 1][k]);

                    if (bestPrev != Integer.MIN_VALUE) {
                        dp[r][c][k] = Math.max(dp[r][c][k], bestPrev + coins[r][c]);
                    }

                    if (coins[r][c] < 0 && k > 0) {
                        int bestPrevNeutral = Integer.MIN_VALUE;

                        if (r > 0) bestPrevNeutral = Math.max(bestPrevNeutral, dp[r - 1][c][k - 1]);
                        if (c > 0) bestPrevNeutral = Math.max(bestPrevNeutral, dp[r][c - 1][k - 1]);

                        if (bestPrevNeutral != Integer.MIN_VALUE) {
                            dp[r][c][k] = Math.max(dp[r][c][k], bestPrevNeutral);
                        }
                    }
                }
            }
        }

        int ans = Integer.MIN_VALUE;
        for (int k = 0; k < 3; k++) {
            ans = Math.max(ans, dp[R - 1][C - 1][k]);
        }

        return ans;
    }
}