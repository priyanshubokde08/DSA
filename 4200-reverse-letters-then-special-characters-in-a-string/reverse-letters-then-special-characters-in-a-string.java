class Solution {
    public String reverseByType(String s) {
        List<Character> alpha = new ArrayList<>();
        List<Character> spec = new ArrayList<>();

        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z') alpha.add(c);
            else spec.add(c);
        }

        int i = alpha.size() - 1; int j = spec.size() - 1;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                sb.append(alpha.get(i));
                i--;
            }else{
                sb.append(spec.get(j));
                j--;
            }
        }
        return sb.toString();
    }
}