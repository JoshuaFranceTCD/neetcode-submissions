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



        if(text1.charAt(index1) == text2.charAt(index2)){
            memo[index1][index2] = 1 + dfs(text1,text2,index1 + 1, index2 + 1);
        }
        else{
            memo[index1][index2] = Math.max(dfs(text1,text2,index1+1,index2),
                dfs(text1,text2,index1,index2+1));
        }

        return memo[index1][index2];
        
    }
}
