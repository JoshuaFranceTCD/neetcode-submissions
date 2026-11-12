class Solution {
    public String foreignDictionary(String[] words) {

        HashMap <Character,HashSet<Character>> adj = new HashMap<>();
        HashMap<Character,Integer> indegree = new HashMap<>();

        for (String word : words) {
            for (char c : word.toCharArray()) {
                adj.putIfAbsent(c, new HashSet<>());
                indegree.putIfAbsent(c,0);
            }
        }

        for(int i = 0; i < words.length-1;i++){
            String w1 = words[i];
            String w2 = words[i+1];
            int len = Math.min(w1.length(),w2.length());
            int j = 0;
            if (w1.length() > w2.length() &&
                w1.substring(0, len).equals(w2.substring(0, len))) {
                return "";
            }
            while(j < len && w1.charAt(j) == w2.charAt(j) ){
                j++;
            }

            if( j != len){
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);
                if (adj.get(c1).add(c2)) {
                    indegree.put(c2, indegree.get(c2) + 1);
                }
            }
        }

        Queue<Character> q = new LinkedList<>();

        for(char c : indegree.keySet()){
            if(indegree.get(c)== 0){
                q.offer(c);
            }
        }

        StringBuilder s = new StringBuilder();
        while(!q.isEmpty()){
            char c = q.poll();
            s.append(c);

            for(char n : adj.get(c)){
                indegree.put(n, indegree.get(n) - 1);
                if(indegree.get(n) == 0){
                    q.offer(n);
                }
            }
        }
        if(s.length() != adj.size()) return "";




        return s.toString();
      
    }
}
