class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] pos = new int[nums.length];
        int[] ans = new int[nums.length];
        int p = 1;
        int s = 1;
        for(int i = 0 ; i < nums.length ; i++){
            pre[i] = p;
            p = p*nums[i];
        }
        for(int j = nums.length-1 ; j >= 0 ; j--){
            pos[j] = s;
            s = s*nums[j];
        }
        for(int k = 0 ; k < nums.length ; k++){
            ans[k] = pre[k]*pos[k];
        }
        return ans;
    }
}  
