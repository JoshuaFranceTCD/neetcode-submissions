class Solution {
    
    public int numIslands(char[][] grid) {
        boolean [][] checked = new boolean [grid.length][grid[0].length];

        int count = 0;
        for (int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if( grid[row][col] == '1' && !checked[row][col]){
                    dfs(row,col,grid,checked);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int row, int col, char[][] grid, boolean[][]checked){
        int rowCount = grid.length, colCount = grid[0].length;
        if(row < 0 || row >= rowCount || col < 0 || col >= colCount
            || grid[row][col]  == '0' || checked[row][col]){
                return;
        }
        checked[row][col] = true;
        dfs(row+1,col,grid,checked);
        dfs(row-1,col,grid,checked);
        dfs(row,col+1,grid,checked);
        dfs(row,col - 1,grid,checked);
    }
}
