class Solution {
    public int maxNumberOfFamilies(int n, int[][] res) {
        Arrays.sort(res, (a, b) -> Integer.compare(a[0], b[0]));
        int cnt = 0;int ans = 0;
        for(int i = 0; i < res.length; i++){
            if(res[i][0] != cnt){
                int count = res[i][0] - cnt - 1;
                ans += count*2;
                cnt = res[i][0];
            }
            List<Integer> list = new ArrayList<>();
            while(i < res.length && res[i][0] == cnt){
                list.add(res[i][1]);
                i++;
            }
            i--;

            boolean part1 = true;
            boolean part2 = true;
            boolean part3 = true;
        
            int j = 0;
            while(j < list.size()){
                if(list.get(j) >= 2 && list.get(j) <= 5){
                    part1 = false;
                }
                if(list.get(j) >= 4 && list.get(j) <= 7){
                    part2 = false;
                }
                if(list.get(j) >= 6 && list.get(j) <= 9){
                    part3 = false;
                }
                j++;
            }
                int count = 0;
                if (part1 && part3) {
                    count = 2;
                } else if (part1 || part2 || part3) {
                    count = 1;
                }
                ans += count;
        }
        return ans + 2*(n-res[res.length-1][0]);
    }
}