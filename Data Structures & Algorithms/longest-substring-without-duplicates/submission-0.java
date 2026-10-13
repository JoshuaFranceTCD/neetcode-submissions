class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLen = 0;
        List<Character> chars = new ArrayList<>();
        for( int right = 0; right < s.length() ; right++ ){
            char c = s.charAt(right);
            while(chars.contains(c)){
                chars.remove(0);
                left++;
            }
            chars.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}