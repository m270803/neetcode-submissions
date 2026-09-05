class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i <= nums.length-3 ; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int s = i+1;
            int e = nums.length-1;
            while(s<e){
                int sum = nums[i] + nums[s] + nums[e];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[s],nums[e]));
                    s++;
                    e--;
                    while(s<e && s>0 && nums[s] == nums[s-1]) s++;
                    while(s<e && e<nums.length-1 && nums[e] == nums[e+1]) e--;
                }
                if(sum < 0){
                    s++;
                }else if(sum > 0){
                    e--;
                }
            }
        }
        return ans;
    }
}
