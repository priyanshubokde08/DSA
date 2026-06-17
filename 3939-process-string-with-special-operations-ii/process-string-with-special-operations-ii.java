class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long store[] = new long[n];
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            long prev = (i == 0) ? 0 : store[i-1];
            if(ch == '*'){
                store[i] = Math.max(0, prev - 1);
            }else if(ch == '#'){
                store[i] = prev*2;
            }else if(ch == '%'){
                store[i] = prev;
            }else{
                store[i] = prev + 1;
            }
        }
        if (k < 0 || k >= store[n-1]) {
            return '.';
        }
        for(int i = n - 1; i >= 0; i--){
            char ch = s.charAt(i);
            long prev = (i == 0) ? 0 : store[i - 1];
            if(ch >= 'a' && ch <= 'z'){
                if(k == prev) return ch;
            }else if(ch == '#'){
                k = k % prev;
            }else if(ch == '%'){
                k = prev - 1 - k;
            }
        }
        return '.';
    }
}