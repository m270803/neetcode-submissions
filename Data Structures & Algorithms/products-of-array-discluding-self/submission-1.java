class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int[] prefix = new int[nums.length];
        int pre = 1;
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = pre;
            pre *= nums[i];
        }
        int[] suffix = new int[nums.length];
        int suf = 1;
        for(int j = nums.length-1 ; j >= 0 ; j--){
            ans[j] *= suf;
            suf *= nums[j];
        }
        return ans;
    }
}
