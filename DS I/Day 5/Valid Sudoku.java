class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> mySet = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(mySet.contains("row" + i + board[i][j]) || mySet.contains("col" + j + board[i][j]) || mySet.contains("box" + i/3 + j/3 + board[i][j]))
                        return false;
                    mySet.add("row" + i + board[i][j]);
                    mySet.add("col" + j + board[i][j]);
                    mySet.add("box" + i/3 + j/3 + board[i][j]);
                }
            }
        }
        return true;
    }
}