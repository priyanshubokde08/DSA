class Solution {
    public double angleClock(int hour, int minutes) {
        double hourHand = 0;
        double minHand = minutes*6;//1 min = 6 degree

        if(hour == 12){
            hourHand = minutes*0.500000;
        }else{
            hourHand = hour*30 + minutes*0.500000;
        }
        double ans = hourHand - minHand;
        if(ans < 0) ans = ans*(-1);
        return (ans <= 180.0) ? ans : (360.0 - ans);
    }
}