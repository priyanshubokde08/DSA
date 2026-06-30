class Solution {
    public boolean doesAliceWin(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for(char ch : s.toCharArray()){
            if(set.contains(ch)) count++;
        }
        if(count == 0) return false;
        else if(count % 2 == 1) return true;
        else{
            return true;
        }
    }
}