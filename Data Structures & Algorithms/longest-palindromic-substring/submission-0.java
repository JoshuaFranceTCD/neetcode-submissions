class Solution {
    public String longestPalindrome(String s) {
        String palindrome ="";
        for( int i = 0; i < s.length(); i++  ){
            int left = i;
            int right = i;
            

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                int len = right - left + 1;
                String current = s.substring(left,right+1);
                //System.out.println(current);
                if ( len >= palindrome.length()){
                    palindrome = current;

                }
                left--;
                right++;
            }
            left = i;
            right = i+1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                int len = right - left + 1;
                if ( len > palindrome.length()){
                    palindrome = s.substring(left,right+1);
                }
                left--;
                right++;
            }
            
        }
        return palindrome;


        
    }
}