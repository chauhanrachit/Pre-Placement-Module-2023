class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return getCount(n, 0, dp);
    }
    public int getCount(int n, int currentSum, int[] dp){
        if(currentSum == n)
            return 1;
        if(currentSum>n)
            return 0;
        if(dp[currentSum] != -1)
            return dp[currentSum];
        int  left = 0;
        for(int i = 1;i<=2;i++)
            left+=getCount(n, currentSum+i, dp);
        return dp[currentSum]= left;
    }
}