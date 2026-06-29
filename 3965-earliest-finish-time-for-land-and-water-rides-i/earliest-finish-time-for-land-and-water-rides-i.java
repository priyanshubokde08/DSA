class Solution {
    public int earliestFinishTime(int[] lst, int[] ld, int[] wst, int[] wd) {

        int n = lst.length;
        int m = wst.length;

        int part1 = 0; //land then water

        int min1 = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            min1 = Math.min(min1, lst[i] + ld[i]);
        }
        int min2 = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++){
            if(wst[i] <= min1){
                min2 = Math.min(min2, wd[i]);
            }else{ // wst[i] > min1
                min2 = Math.min(min2, wst[i] - min1 + wd[i]);
            }
        }
        part1 = min1 + min2;

        int part2 = 0; // water then land

        int min3 = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++){
            min3 = Math.min(min3, wst[i] + wd[i]);
        }
        int min4 = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(lst[i] <= min3){
                min4 = Math.min(min4, ld[i]);
            }else{ // lst[i] > min3
                min4 = Math.min(min4, lst[i] - min3 + ld[i]);
            }
        }
        part2 = min3 + min4;

        return Math.min(part1, part2);
    }
}