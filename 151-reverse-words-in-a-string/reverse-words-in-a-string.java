class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
    String word[] = s.trim().split("\\s+");
    for(int i = word.length - 1; i >= 0; i--){
        sb.append(word[i]).append(' ');
    }
    while(sb.charAt(0) == ' '){
        sb.deleteCharAt(0);
    }
    while(sb.charAt(sb.length() - 1) == ' '){
        sb.deleteCharAt(sb.length() - 1);
    }
    return sb.toString();
    }
}