class Solution {
    public String sortVowels(String s) {
        int[] lowercase = new int[26];
        int[] uppercase = new int[26];

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                lowercase[arr[i] - 'a']++;
                arr[i] = '*';
            }
            else if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
                uppercase[arr[i] - 'A']++;
                arr[i] = '*';
            }
        }

        String ans = "";

        for (int i = 0; i < 26; i++) {
            while (uppercase[i] > 0) {
                char c = (char)('A' + i);
                ans = ans + c;
                uppercase[i]--;
            }
        }

        for (int i = 0; i < 26; i++) {
            while (lowercase[i] > 0) {
                char c = (char)('a' + i);
                ans = ans + c;
                lowercase[i]--;
            }
        }

        int first = 0;
        int second = 0;

        while (first < arr.length) {
            if (arr[first] == '*') {
                arr[first] = ans.charAt(second);
                second++;
            }
            first++;
        }

        return new String(arr);
    }
}