class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        while(numBottles>=numExchange){
            int val=numBottles/numExchange;
            numBottles=val+(numBottles%numExchange);
            count+=val;
        }   
        return count;
    }
}