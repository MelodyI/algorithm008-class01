class Solution {
    public int coinChange(int[] coins, int amount) {
        int ans = 0;
        Arrays.sort(coins);
        for (int i = coins.length - 1; i >= 0 && amount > 0; i--) {
            if (amount < coins[i]) continue;
            ans += amount / coins[i];
            amount %= coins[i];
        }
        return (amount == 0)? ans:-1;
    }
}
