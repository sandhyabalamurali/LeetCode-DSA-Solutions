// Last updated: 6/22/2025, 11:03:06 AM
class Solution {
public:
    int numWays(vector<string>& words, string target) {
        const int MOD = 1e9 + 7;
        int n = words[0].size();
        int m = target.size(); 
        vector<vector<int>> freq(n, vector<int>(26, 0));
        for (const string& word : words) {
            for (int i = 0; i < n; ++i) {
                freq[i][word[i] - 'a']++;
            }
        }

        vector<vector<long long>> dp(n + 1, vector<long long>(m + 1, 0));
       
        for (int i = 0; i <= n; ++i) {
            dp[i][m] = 1;
        }
        for (int i = n - 1; i >= 0; --i) {
            for (int j = m - 1; j >= 0; --j) {
                dp[i][j] = dp[i + 1][j];

                if (freq[i][target[j] - 'a'] > 0) {
                    dp[i][j] += freq[i][target[j] - 'a'] * dp[i + 1][j + 1];
                    dp[i][j] %= MOD; 
                }
            }
        }
        return dp[0][0];
    }
};
