class Solution {
public:
    int numRollsToTarget(int n, int k, int target) {
        const int MOD = 1e9 + 7;
    vector<vector<int>> dp(n + 1, vector<int>(target + 1, 0));
    
    // Base case: one way to get a sum of 0 with 0 rolls
    dp[0][0] = 1;
    
    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= target; ++j) {
            for (int face = 1; face <= k; ++face) {
                if (j - face >= 0) {
                    // Add the number of ways to get (j - face) with (i - 1) rolls
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - face]) % MOD;
                }
            }
        }
    }
    
    return dp[n][target];
}
};