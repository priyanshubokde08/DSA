class Solution {
    public int maxDistinct(String s) {
        int present[] = new int[26];
        int count = 0;
        for(char c : s.toCharArray()){
            present[c - 'a']++;
            if(present[c - 'a'] == 1) count++; 
        }
        return count;
    }
}