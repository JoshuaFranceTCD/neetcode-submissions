class Solution {
    int[][]memo;
    public int longestCommonSubsequence(String text1, String text2) {
        memo = new int [text1.length()][text2.length()];
        for(int[] l : memo){
            Arrays.fill(l,-1);
        }



        
        return dfs(text1,text2,0,0);
    }

    int dfs(String text1, String text2, int index1, int index2){
        int max = 0;

        if(index1 == text1.length() || index2 == text2.length()) return 0;
        if(memo[index1][index2] != -1) return memo[index1][index2];


        for(int i = index1; i < text1.length(); i++){
            for(int j = index2; j < text2.length(); j++){
                if(text1.charAt(i) == text2.charAt(j)){
                    
                    max = Math.max(max,1 + dfs(text1,text2,i+1,j+1));
                }
            }
        }
        memo[index1][index2] = max;
        return max;
    }
}
