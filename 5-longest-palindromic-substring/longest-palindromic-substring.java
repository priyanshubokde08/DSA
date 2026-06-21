class Solution {
    static boolean ispalindrome(String s){
        int left = 0;int right = s.length() - 1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        String str = ""; int maxlen = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(j - i + 1> maxlen && ispalindrome(s.substring(i,j + 1))){
                    maxlen = j - i + 1;
                    str = s.substring(i,j+1);
                }
            }
        }
        return str;
    }
}