 class Solution{
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        long[] minCounts = new long[amount+1];
        for (int i = 1; i <= amount; ++i) {
            minCounts[i] = Integer.MAX_VALUE;
            for (int c: coins) {
                minCounts[i] = Math.min(minCounts[i], i >= c ? minCounts[i-c] + 1 : Integer.MAX_VALUE);
            }
        }
        return minCounts[amount] == Integer.MAX_VALUE ? -1 : (int) minCounts[amount];
    }
  }