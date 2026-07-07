class Solution {
    public String convert(String s, int nr) {

        int n = s.length();

        StringBuilder sb = new StringBuilder();
        if(nr <= 1 || nr >= n){

            return s;

        }else {
            int cycle = 2*nr - 2;
            for(int i = 0; i < nr; i++){
                int j = i;
                boolean down = true;
                while(j < n){
                    sb.append(s.charAt(j));
                    if(i == 0 || i == nr - 1){
                        j += cycle;
                    }else{
                        if(down){
                            j += cycle - 2*i;
                        }else{
                            j += 2*i;
                        }
                    }
                    down = !down;
                }
            }
            return sb.toString();
        }
    }
}