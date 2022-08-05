class Solution {
    public int[][] updateMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int i = 0;i<m;i++)
            for(int j = 0;j<n;j++)
                dp[i][j] = 200000;
        for(int i = 0;i<m;i++)
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 0)
                    dp[i][j] = 0;
                else{
                    if(i > 0 && j == 0)
                        dp[i][j] = Math.min(dp[i-1][j] + 1, dp[i][j]);
                    else if(j > 0 && i == 0)
                        dp[i][j] = Math.min(dp[i][j-1] + 1, dp[i][j]);                    
                    else if(i > 0 && j > 0)
                        dp[i][j] = Math.min(Math.min(dp[i-1][j]+1, dp[i][j-1]+1), dp[i][j]);
                }
            }
        for(int i = m - 1; i >= 0; i--)
            for(int j = n - 1; j >= 0; j--){
                if(grid[i][j] == 0)
                    dp[i][j] = 0;
                else{
                    if(i < m-1 && j == n-1)
                        dp[i][j] = Math.min(dp[i+1][j] + 1, dp[i][j]);
                    if(j < n - 1 && i == m - 1)
                        dp[i][j] = Math.min(dp[i][j+1] + 1, dp[i][j]);
                    else if(i < m-1 && j < n-1)
                        dp[i][j] = Math.min(Math.min(dp[i+1][j]+1, dp[i][j+1]+1), dp[i][j]);
                }
            }
        return dp;
    }
}