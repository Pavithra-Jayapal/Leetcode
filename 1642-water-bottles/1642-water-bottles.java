class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int cnt=numBottles,empty=numBottles;//since i can drink all ootles
      while(empty>=numExchange){
        int trade=empty/numExchange;//i can buy full bottle w...ith bottle i emptied
        cnt+=trade;//since i can also empty the traded bottle it is also counted
        empty = (empty % numExchange) + trade;
//
      }  
      return cnt;
    }
}