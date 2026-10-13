class Solution {
    public boolean isPalindrome(String s) {
        boolean palindrome = true;
        int right = s.length()-1;
        int left = 0;
        String phrase = s.toLowerCase();
        //System.out.println(phrase);
        while ( left < right){
            while(( (phrase.charAt(left) < 'a' || phrase.charAt(left) > 'z' )
                && (phrase.charAt(left) < '0' || phrase.charAt(left) > '9' ) )
                && left < right  ){
                left++;
            }
             while(( (phrase.charAt(right) < 'a' || phrase.charAt(right) > 'z' )
                &&   (phrase.charAt(right) < '0' || phrase.charAt(right) > '9' ) )
                && left < right  ){
                right--;
            }
            //System.out.println( "Left: " + phrase.charAt(left) + " Right: " + phrase.charAt(right));
            if( phrase.charAt(right) != phrase.charAt(left) ){
                palindrome = false;
                return palindrome;
            }
            left++;
            right--;
        }

        return palindrome;
        }
        
    }
