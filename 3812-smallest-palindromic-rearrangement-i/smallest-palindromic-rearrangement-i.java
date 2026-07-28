class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if(n <= 3) return s;
        char sub[] = s.substring(0, n/2).toCharArray();
        Arrays.sort(sub);

        StringBuilder sb = new StringBuilder();
        for(char ch : sub) sb.append(ch);
        if(n%2 == 1) sb.append(s.charAt(n/2));
        for(int i = sub.length - 1; i >= 0; i--){
            sb.append(sub[i]);
        }
        return sb.toString();
    }
}