class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;int n = s.length();
        int f[] = new int[3];
        int l = 0;
        for(int r = 0; r < n; r++){
            f[s.charAt(r) - 'a']++;
            while(f[0] > 0 && f[1] > 0 && f[2] > 0){
                count += n - r;
                f[s.charAt(l) - 'a']--;
                l++;
            }
        }
        
    // for(int i = 0; i <= n-3; i++){
//     int a = 0;int b = 0; int c = 0;int k = 0;
//     while(k < 3){
//         if(s.charAt(i + k) == 'a') a++;
//         else if(s.charAt(i + k) == 'b') b++;
//         else if(s.charAt(i + k) == 'c') c++;
//         k++;
//     }
//     if(a > 0 && b > 0 && c > 0) count++;
//     for(int j = i + 3; j < n; j++){
//         if(s.charAt(j) == 'a') a++;
//         else if(s.charAt(j) == 'b') b++;
//         else if(s.charAt(j) == 'c') c++;
//         if(a > 0 && b > 0 && c > 0) count++;
//     }
// }

        return count;
    }
}