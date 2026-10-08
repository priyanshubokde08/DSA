class Solution {
    public String removeOuterParentheses(String s) {
       int n = s.length();
       List<String> list = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            int op = 0; int cl = 0;
        for(char x : s.toCharArray()){
            if(x == '('){
                op++;
            }else{
                cl++;
            }
            sb.append(x);
            if(op == cl && op != 0){
                list.add(sb.toString());
                sb.setLength(0);
                op = 0; cl = 0;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(String x : list){
            for(int i = 1; i < x.length()-1; i++){
                ans.append(x.charAt(i));
            }
        }
        return ans.toString();
    }
}