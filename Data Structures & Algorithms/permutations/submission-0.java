class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        permutation(nums,res,used,new ArrayList<>());
        return res;
    }
    private void permutation(int[] nums,List<List<Integer>> res,boolean[] used,List<Integer> curr){
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0 ; i < nums.length ; i++){

        if(used[i]){
            continue;
        }

        curr.add(nums[i]);
        used[i] = true;

        permutation(nums,res,used,curr);

        used[i] = false;
        curr.removeLast();
        }
    }
}
