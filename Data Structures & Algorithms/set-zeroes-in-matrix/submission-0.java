class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];



        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                if(matrix[r][c]== 0){
                    rows[r] = true;
                    cols[c] = true;
                }
            }
        }
        for(int i = 0; i < rows.length; i++){
            if(rows[i]){
                for(int c = 0; c < n; c++ ){
                    matrix[i][c] = 0;
                }
            }
        }
        for(int i = 0; i < cols.length; i++){
            if(cols[i]){
                for(int r = 0; r < m; r++ ){
                    matrix[r][i] = 0;
                }
            }
        }
        
    }
}
