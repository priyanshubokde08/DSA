class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans, "", 0, 0, n);
        return ans;
    }
    static void generate(List<String> ans, String curr, int open, int close, int n){
        if(curr.length() == 2*n){ //when curr string size becomes 2*n i.e.complete , add it to ans list
            ans.add(curr);
            return;
        }
        // everytime we have two options i.e choose "(" or ")"
        
        if(open < n){ // we can use "(", anytime when we have open bracket
            generate(ans,curr + "(", open+1, close, n);
        }
        if(close < open){ // count of open brack should be grater than close, only when we can use close one
            generate(ans, curr + ")", open, close+1, n);
        }
    }
}