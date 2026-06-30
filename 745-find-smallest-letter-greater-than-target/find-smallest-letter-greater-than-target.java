class Solution {
    public char nextGreatestLetter(char[] let, char t) {
        int n = let.length; int left = 0; int right = n - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(let[mid] > t) right = mid - 1;
            else left = mid + 1;
        }
        return let[left % n];
    }
}