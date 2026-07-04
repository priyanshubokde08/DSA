class Solution {
    static boolean ispalin(int x){
        String s = String.valueOf(x);
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    static int convert(int x, int base) {
    int ans = 0;
    int place = 1;

    while (x > 0) {
        ans += (x % base) * place;
        place *= 10;
        x /= base;
    }

        return ans;
    }
    public boolean isStrictlyPalindromic(int n) {
        int org = n;
        for(int x = 2; x <= n - 2; x++){
            int temp = convert(org, x);
            if(!ispalin(temp)) return false;
        }
        return true;
    }
}