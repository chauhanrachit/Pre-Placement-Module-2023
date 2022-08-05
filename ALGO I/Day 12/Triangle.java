class Solution {
    public int minimumTotal(List<List<Integer>> arr) {
        if (arr.size()==1) return arr.get(0).get(0);
        var maxI=arr.size()-1;
        var min = Integer.MAX_VALUE;
        
        for (int i=1;i<=maxI;i++){
            var prevRow = arr.get(i-1);
            var row = arr.get(i);
            var maxJ=row.size()-1;
            for (int j=0;j<=maxJ;j++){
                var cur = row.get(j);
                if      (j==0)    cur+=prevRow.get(0);
                else if (j==maxJ) cur+=prevRow.get(maxJ-1);
                else              cur+=Math.min(prevRow.get(j), prevRow.get(j-1));
                row.set(j,cur);
                if (i==maxI) min=Math.min(min,cur);
            }
        }
        return min;
    }
}