class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        subset(nums,res,0,new ArrayList<>());
        return res;
    }
    private void subset(int[] nums,List<List<Integer>> res,int start,List<Integer> curr){
        if(start == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        res.add(new ArrayList<>(curr));
        for(int i = start ; i < nums.length ; i++){
            if(i>=1 && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);
            subset(nums,res,i+1,curr);
            curr.removeLast();
        }
    }
}
