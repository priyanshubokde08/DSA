class Solution {
    public int solve(int idx, String[] words, int[] freq, int[] val){

    if(idx == words.length){
        return 0;
    }

    // Option 1: Skip the current word
    int notTake = solve(idx + 1, words, freq, val);

    // Option 2: Take the current word (if possible)
    boolean possible = true;
    
    for(char ch : words[idx].toCharArray()){
        freq[ch - 'a']--;
        if(freq[ch - 'a'] < 0){
            possible = false;
        }
    }

    int take = 0;

    if(possible){
        take = val[idx] + solve(idx + 1, words, freq, val);
    }

    // Backtrack
    for(char ch : words[idx].toCharArray()){
        freq[ch - 'a']++;
    }

    return Math.max(take, notTake);
}
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int w = words.length;
        int val[] = new int[w];
        for(int i = 0; i < w; i++){
            int sum = 0;
            for(char c : words[i].toCharArray()){
                sum += score[c - 'a'];
            }
            val[i] = sum;
        }
        int freq[] = new int[26];
        for(char x : letters){
            freq[x - 'a']++;
        }
        
        return solve(0, words, freq, val);
    }
}