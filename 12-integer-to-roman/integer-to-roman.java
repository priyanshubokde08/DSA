class Solution {
    public String intToRoman(int num) {
    String s = String.valueOf(num);
    int[] value = new int[s.length()];

    int place = 1;

    for (int i = s.length() - 1; i >= 0; i--) {
        value[i] = (s.charAt(i) - '0') * place;
        place *= 10;
    }
    StringBuilder sb = new StringBuilder();
    for(int x : value){
        if(x >= 1000){
            int k = x / 1000;
            for(int i = 1; i <= k; i++) sb.append('M');

        }else if(x >= 100){
            if(x == 900){
                sb.append('C').append('M');
            }else if(x == 400){
                sb.append('C').append('D');
            }else{
            int k = x;
            if(x >= 500) {k = x - 500; sb.append('D');}
            k /= 100;
            for(int i = 1; i <= k; i++) sb.append('C');
            }
        }else if(x >= 10){
            if(x == 90){
                sb.append('X').append('C');
            }else if(x == 40){
                sb.append('X').append('L');
            }else{
            int k = x;
            if(x >= 50) {k = x - 50; sb.append('L');}
            k /= 10;
            for(int i = 1; i <= k; i++) sb.append('X');
            }
        }else{
            if(x == 9){
                sb.append('I').append('X');
            }else if(x == 4){
                sb.append('I').append('V');
            }else{
            int k = x;
            if(x >= 5) {k = x - 5; sb.append('V');}
            for(int i = 1; i <= k; i++) sb.append('I');
            }
        }
    }
    return sb.toString();
    }
}