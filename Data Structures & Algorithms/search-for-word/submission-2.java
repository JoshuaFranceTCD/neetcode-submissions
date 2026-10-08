class Solution {
    public HashSet<List<Integer>>  path;
    public boolean [][] visited;


    public boolean exist(char[][] board, String word) {
        //path = new HashSet<List<Integer>>();
        visited = new boolean [board.length][board[0].length];

        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                if(backtrack(row,col,0,board,word)) return true;
            }
        }
        return false;
        
    }

    public boolean backtrack(int row, int col, int index, char[][]board,String word){
        if(row < 0 || row >= board.length || col < 0 || col >= board[row].length || board[row][col] != word.charAt(index) || visited[row][col]){
            return false;
        }
        if(index == word.length()- 1){
            return true;
        }
        visited[row][col] = true;
        boolean result =  backtrack(row + 1, col, index + 1,board, word) 
            || backtrack(row - 1, col, index + 1, board, word) 
            || backtrack(row,col + 1, index + 1,board, word )
            || backtrack(row,col - 1, index + 1,board,word);
        visited[row][col] = false;
        return result;

        
    }
}