class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int low=0,high=tokens.length-1;
        int score=0,maxscore=0;
        while(low<=high){
            if(power>=tokens[low]){
                power-=tokens[low];
                score++;
                low++;
                maxscore=Math.max(score,maxscore);
            }
            else if(score>0){
                    power+=tokens[high];
                    score--;
                    high--;
                }
            
            else{
                break;
            }
           
        }
         return maxscore;
    }
}