class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a=new ArrayList();
        if(numRows==0)
            return a;
        for(int i=1;i<=numRows;i++){
            List<Integer> row=new ArrayList();
            for(int j=0;j<i;j++){
              if(j==0 || j==i-1)
                row.add(1);
              else
                row.add(a.get(i-2).get(j)+a.get(i-2).get(j-1));
            }
            a.add(row);
        }
        return a;
    }
}
