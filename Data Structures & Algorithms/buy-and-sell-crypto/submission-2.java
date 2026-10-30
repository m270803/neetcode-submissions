class Solution {
    public int maxProfit(int[] arr) {
        int maxProfit = Integer.MIN_VALUE;
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i]<min){
                min = arr[i];
            }else{
                maxProfit = Math.max(maxProfit,arr[i]-min);
            }
        }
        if(maxProfit == Integer.MIN_VALUE){
            return 0;
        }else{
            return maxProfit;
        }
    }
}
