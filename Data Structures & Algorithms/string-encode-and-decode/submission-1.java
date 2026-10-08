class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";
        for(String s : strs){
            int l = s.length();
            encodedString += "{"+l+"}"  + s;
            //encodedString += l  + s;

            System.out.println(encodedString);
        }
        return encodedString;

    }

    public List<String> decode(String str) {
        char[] charArray = str.toCharArray();
        List<String> decodedString = new ArrayList<>();
        int index = 0;
        while ( index < str.length()){
            System.out.println(charArray[index]);
            //int length = charArray[index] - '0';
            int open = index+1;
            int close = str.indexOf("}",index+1);
            int length = Integer.valueOf(str.substring(open, close));
            String s = str.substring(close + 1, close + length+1);
            decodedString.add(s);
            index = close + length + 1;
        }

        return decodedString;

    }
}
