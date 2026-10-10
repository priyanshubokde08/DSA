class Solution {
    class pair{
        int n1; int n2;
        pair(int n1, int n2){
            this.n1 = n1;
            this.n2 = n2;
        }
    }
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int k = k1 + k2;

        int n = nums1.length;
        int diff[] = new int[n];
        long c = 0;int max = 0;
        for(int i = 0; i < n; i++){
            diff[i] = Math.abs(nums1[i]-nums2[i]);
            c += diff[i];
            max = Math.max(max, diff[i]);
        }
        if(c <= k) return 0;
        
        int left = 0; int right = max; 
        while(left <= right){
            int mid = left + (right-left)/2;
            long high = 0;
            
            for(int d : diff){
                high += Math.max(0, d-mid);
            }
            if(high <= k){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        int level = left; long used = 0; long ans = 0;

        for (int d : diff) {
            int reduced = Math.min(d, level);
            used += d - reduced;
            ans += (long) reduced*reduced; // got power
        }

        long rem= k - used;

        // Reduce remaining differences from level to level - 1 until we have xtra k i.e. rem k
        for (int d : diff) {
            if (rem == 0) break;
            if (d >= level && level > 0) {
                ans -= (long) level * level;
                ans += (long) (level - 1) * (level - 1);
                rem--;
            }
        }
        return ans;
    }
}