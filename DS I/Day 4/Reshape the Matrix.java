class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int r1=mat.length;
        int c1=mat[0].length;
        if(r1*c1!=r*c)
            return mat;
        int sr=0;
        int sc=0;
        int a[][]=new int[r][c];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[sr][sc]=mat[i][j];
                sc++;
                if(sc==c){
                    sc=0;
                    sr++;
                }
            }
        }
        return a;
    }
}
