class Solution {
    public int numDecodings(String s) {
        if(s.length() == 0 || s.charAt(0) == '0') return 0;
        HashMap<Integer,Integer> cache = new HashMap<>();

        return help(s,0,cache);
        
    }

    public int help(String s, int index, Map<Integer, Integer> cache){
        if(cache.containsKey(index)) return cache.get(index);
        if(index == s.length()) return 1;
        if(s.charAt(index) == '0') return 0;
        int result = help(s,index+1,cache);
        if(index < s.length() - 1){
            if(s.charAt(index) == '1' || (s.charAt(index) == '2' && s.charAt(index + 1) <= '6')){
                result += help(s,index + 2,cache);
            }
        }
        cache.put(index,result);
        return result;
    }
}
