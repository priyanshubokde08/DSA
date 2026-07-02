class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String word[] = s.split(" ");
        for(int i = 0; i < word.length; i++){
            StringBuilder res = new StringBuilder(word[i]).reverse();
            sb.append(res).append(' ');
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }
}