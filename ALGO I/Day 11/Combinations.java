class Solution {
     public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int bitK = 1;
        for (int i = 0; i < k; i++) bitK <<= 1;
        bitK--;
        for (int i = 0; i < n - k; i++) bitK <<= 1;
        while (bitK > 0) {
            if (!countKOnes(bitK--, k)) continue;
            int x = bitK + 1;
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if ((x & 1) == 1) list.add(i);
                x >>= 1;
            }
            res.add(list);
        }
        return res;
    }
    private boolean countKOnes(int n, int k){
        int c = 0;
        while (n > 0) {
            c += (n & 1);
            if (c > k) return false;
            n >>= 1;
        }
        return c == k;
    }
}