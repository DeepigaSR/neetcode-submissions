class Solution {
    public boolean isValidSudoku(char[][] board) {
         HashSet<Character> row = new HashSet<>();
         HashSet<Character> col = new HashSet<>();
         HashSet<Character>[] boxes = new HashSet[9];
         for(int i=0;i<9;i++){
            boxes[i] = new HashSet<>();
         }
         
         for(int r=0;r<9;r++)
         {
            row.clear();
            col.clear();
            for(int c=0;c<9;c++){
                    if(board[r][c]!='.' && !(row.add(board[r][c])) )
                     return false;

                    if(board[c][r]!='.' && !(col.add(board[c][r])) )
                     return false;

                     int boxInd = r/3+ (c/3)*3;
                     if(board[r][c]!='.' && !(boxes[boxInd].add(board[r][c])) ){
                        return false;
                     }

            }
         }
         return true;

    }
}
