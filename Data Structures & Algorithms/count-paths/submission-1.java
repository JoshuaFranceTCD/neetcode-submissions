class Solution {
    int width = 0, length = 0;

    int[][]memo;
    public int uniquePaths(int m, int n) {
        width = m;
        length = n;
        memo= new int[m][n];
        for(int[] row : memo){
            Arrays.fill(row,-1);
        }
        return dfs(0,0);
    }

    public int dfs(int x, int y){
        if(x >= width || y >= length) return 0;
        if(memo[x][y] != -1) return memo[x][y];

        if(x == width - 1 && y == length - 1) {
            return 1;
        }
        int uniquePaths = dfs(x+1,y) + dfs(x,y+1);
        memo[x][y] = uniquePaths;
        return uniquePaths;
        
    }
}
