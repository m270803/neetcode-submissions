class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre = 1;
        int[] prefix = new int[nums.length];
        int suff = 1;
        int[] suffix = new int[nums.length];
        int[] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            prefix[i] = pre;
            pre = pre*nums[i];
        }
        for(int j = nums.length-1 ; j >= 0  ; j--){
            suffix[j] = suff;
            suff = suff*nums[j];
        }
        for(int k = 0 ; k < nums.length ; k++){
            ans[k] = prefix[k]*suffix[k];
        }
        return ans;
    }
}  
