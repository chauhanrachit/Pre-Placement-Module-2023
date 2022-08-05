public class Solution {
    public int hammingWeight(int n) {
        if (n == 0) return 0;
        int ans = 0;
        while (n != 0){
            if ((n & 1) != 0)
                ans++;
            n >>>= 1;
        }
        return ans;
    }
}