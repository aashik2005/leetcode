class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);

        long sum = 0;
        int taken = 0;

        for (int i = happiness.length - 1; i >= 0 && taken < k; i--) {
            int value = happiness[i] - taken;
            if (value > 0) {
                sum += value;
            }
            taken++;
        }

        return sum;
    }
}
