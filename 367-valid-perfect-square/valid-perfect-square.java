class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        long left=1;
        long right=num/2;
        while(left<=right){
            long mid = left + (right - left) / 2;
            long check=mid*mid;
            if(check==num){
                return true;
            }
            else if(check<num){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
}