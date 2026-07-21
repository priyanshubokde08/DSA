class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        char arr[] = s.toCharArray();
        int n = arr.length;
        int count = 0;  int max = 0;
        int first = 0; int sec = 0;

        int i = 0;
        while(i < n){
            if(arr[i] == '0'){
                i++;
                first++;
            }else{
                while(i < n && arr[i] == '1'){
                    i++;
                    count++;
                }
                while(i < n && arr[i] == '0'){
                    i++;
                    sec++;
                }
                if(first != 0 && sec != 0) max = Math.max(max, first + sec);
                first = sec;
                sec = 0;
            }
        }
        return count + max;
    }
}