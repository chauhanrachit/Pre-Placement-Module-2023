public class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        int val;
        for(int i=0; i < 31; i++){
            val = (n & (1 << i)) > 0 ? 1 : 0;
            ans = ((ans << 1) | val);
        }
        ans = n < 0 ? ans << 1 | 1 : ans << 1;
        return ans;
    }
}