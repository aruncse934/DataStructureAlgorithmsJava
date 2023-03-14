class Solution {
    public int longestIdealString(String s, int k) {
         int[] maxEndingWith=new int[26];
        int[] dp=new int[100006];
        int ans=0;
        for(int i = 1; i <= s.length(); i++) {
            int cur = s.charAt(i-1) - 'a';
            for(int j = cur-1; j >= Math.max(0, cur - k); j--) {
                dp[i] = Math.max(dp[i], 1 + maxEndingWith[j]);
            }
            for(int j = cur; j <= Math.min(25, cur + k); j++) {
                dp[i] = Math.max(dp[i], 1 + maxEndingWith[j]);
            }
            maxEndingWith[cur] = dp[i];
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}