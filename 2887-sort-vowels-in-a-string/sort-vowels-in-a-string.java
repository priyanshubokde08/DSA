class Solution {
    public String sortVowels(String s) {
        int n = s.length();
    Stack<Character> st = new Stack<>();
    Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u','A','E','I','O','U'));

    ArrayList<Character> list = new ArrayList<>();
    for(char ch : s.toCharArray()){
        if(set.contains(ch)) list.add(ch);
    }
    Collections.sort(list);
    int k = 0;
    for(int i = 0; i < n; i++){
        char ch = s.charAt(i);
        if(!set.contains(ch)){
            st.push(ch);
        }else{
            st.push(list.get(k));
            k++;
        }
    }
    StringBuilder sb = new StringBuilder();
    while (!st.isEmpty()) {
        sb.append(st.pop());
    }
    return sb.reverse().toString();
    }
}