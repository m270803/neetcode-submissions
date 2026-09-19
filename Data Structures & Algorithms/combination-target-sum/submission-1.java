class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        subset(nums,target,res,0,new ArrayList<>());
        return res;
    }
    private void subset(int[] nums,int target,List<List<Integer>> res,int start,List<Integer> curr){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i = start ; i < nums.length ; i++){
            if(i>=1 && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);
            subset(nums,target-nums[i],res,i,curr);
            curr.removeLast();
        }
    }
}
