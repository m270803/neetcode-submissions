class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;
                if (!isValid(i, j, board[i][j], board)) {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isValid(int r,int c,char ch,char[][] board){
        //check col
        for(int i = 0 ; i < 9 ; i++){
            if(i != r && board[i][c] == ch){
                return false;
            }
        }
        //check row
        for(int j = 0 ; j < 9 ; j++){
            if(j != c && board[r][j] == ch){
                return false;
            }
        }
        //check 3x3 box
        int rowStart = r - r%3;
        int colStart = c - c%3;
        for(int x = rowStart ; x < rowStart+3 ; x++){
            for(int y = colStart ; y < colStart+3 ; y++){
                if((x != r || y != c) && (board[x][y] == ch)){
                    return false;
                }
            }
        }
        return true;
    } 
}
