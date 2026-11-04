class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {


        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> res = new ArrayList<Integer>();

        int top = 0, bottom = m, l = 0, r = n;

        while (top < bottom && l < r){

            for(int i = l; i < r; i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i < bottom; i++){
                res.add(matrix[i][r-1]);
            }
            r--;
            if (!(l < r && top < bottom)) {
                break;
            }
            for(int i = r-1; i >= l; i--){
                res.add(matrix[bottom-1][i]);
            }
            bottom--;
            for(int i = bottom - 1; i >= top ; i--){
                res.add(matrix[i][l]);
            }
            l++;

         }
         return res;
        
        
    }
}
