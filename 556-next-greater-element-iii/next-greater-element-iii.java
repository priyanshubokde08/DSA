class Solution {
  
    public int nextGreaterElement(int n) {
         
        char[] arr = String.valueOf(n).toCharArray();

        // Find pivot
        int i = arr.length - 2;
        for(; i >= 0; i--){
            if(arr[i] < arr[i + 1]) break;
        }
        if(i < 0) return -1;

        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Swap
        char temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

     int last = arr.length - 1;
        j = i + 1;
        while (j < last) {
            temp = arr[j];
            arr[j] = arr[last];
            arr[last] = temp;
            j++;
            last--;
        }

        long num = 0 ;
        for(int k = 0; k < arr.length; k++){
            num = num * 10 + arr[k] - '0';
        }
        if (num > Integer.MAX_VALUE) return -1;
        
        return (int) num;
    }
}