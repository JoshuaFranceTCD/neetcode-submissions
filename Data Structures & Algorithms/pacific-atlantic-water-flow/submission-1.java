class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int rows = heights.length, cols = heights[0].length;

        boolean[][] pac = new boolean[rows][cols];
        boolean[][] atl = new boolean[rows][cols];
    

        for(int i = 0; i < heights[0].length; i++){
            dfs(0,i,heights,pac);
            dfs(rows-1,i,heights,atl);
        }
        for(int i = 0; i < rows; i++){
            dfs(i,0,heights,pac);
            dfs(i,cols-1,heights, atl);
        }
        for(int r = 0; r < rows; r ++ ){
            for(int c = 0; c < cols; c++){
                if(pac[r][c] && atl[r][c]){
                    ArrayList<Integer> point = new ArrayList<>();
                    point.add(r);
                    point.add(c);
                    result.add(point);
                }
            }
        }

        
        return result;
    }
    public void dfs(int row, int col, int[][] grid,boolean[][]visited){
        if(visited[row][col]) return;
        visited[row][col] = true;

        if(col - 1 >= 0 && (grid[row][col - 1] >= grid[row][col])) dfs(row,col-1,grid,visited);
        if(col + 1 < grid[0].length && (grid[row][col + 1] >= grid[row][col])){ 
            dfs(row,col+1,grid,visited);
        }
        if(row - 1 >= 0 && (grid[row - 1][col] >= grid[row][col])) dfs(row - 1,col,grid,visited);

        if(row + 1 < grid.length  && (grid[row + 1][col] >= grid[row][col])){ 
            dfs(row + 1,col,grid,visited);
        }
    }
    
}
