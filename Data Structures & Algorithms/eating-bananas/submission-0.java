class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int i = 0 ; i < piles.length ; i++){
            right = Math.max(right,piles[i]);
        }
        while(left<right){
            int k = left + (right-left)/2;
            int hours = 0;
            for(int j = 0 ; j < piles.length ; j++){
                hours += (int)Math.ceil((double)piles[j]/k);
            }
            if(hours>h){
                left = k+1;
            }else{
                right = k; 
            }
        }
        return left;
    }
}
