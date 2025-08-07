class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // base case

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;

            if (prefixCount.containsKey(sum - goal)) {
                count += prefixCount.get(sum - goal);
            }

            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
