class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int maxSe = 1;
        int seq = 1;
        for(int j = 0 ; j < nums.length ; j++){
            if(j > 0 && nums[j] == nums[j-1]){
                continue;
            }
            if(j > 0 && nums[j] == nums[j-1]+1){
                seq++;
            }else{
                seq = 1;
            }
            maxSe = Math.max(maxSe,seq);
        }
        return maxSe;
    }
}
