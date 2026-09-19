class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        subset(candidates,target,res,0,new ArrayList<>());
        return res;
    }
    private void subset(int[] arr,int target,List<List<Integer>> res,int start,List<Integer> curr){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0){
            return;
        }
        for(int i = start ; i < arr.length ; i++){
            if(i > start && arr[i] == arr[i-1]) continue;
            curr.add(arr[i]);
            subset(arr,target-arr[i],res,i+1,curr);
            curr.removeLast();
        }
    }
}
