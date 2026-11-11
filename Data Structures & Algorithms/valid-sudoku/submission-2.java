class Solution {
    public boolean isValidSudoku(char[][] board) {
        //check rows

        for(int r = 0; r < 9; r++){
            HashSet<Character> visited = new HashSet<>();
            for(int c = 0; c < 9; c++){
                char num =  board[r][c];
                if( num == '.')continue;
                if(visited.contains(num)) return false;
                visited.add(num);
            }
        }
        //check columns
        for(int c = 0; c < 9; c++){
            HashSet<Character> visited = new HashSet<>();
            for(int r = 0; r < 9; r++){
                char num =  board[r][c];
                if( num == '.')continue;
                if(visited.contains(num)) return false;
                visited.add(num);
            }
        }

        //check boxes
        for(int boxRow = 0; boxRow < 9; boxRow+=3){
            for(int boxCol = 0; boxCol < 9; boxCol+=3){
                
                HashSet<Character> visited = new HashSet<>();
                for(int r = 0; r < 3; r++){
                    for(int c = 0; c < 3; c++){
                        char num =  board[boxRow + r][boxCol + c];
                        if( num == '.')continue;
                        if(visited.contains(num)) return false;
                        visited.add(num);
                    }
                }
            }
        }

        return true;
    }
}
