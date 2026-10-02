class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Integer[] arr = map.keySet().toArray(new Integer[0]);
        Arrays.sort(arr,(a,b) -> map.get(b) - map.get(a));
        for(int j = 0 ; j < k ; j++){
            ans[j] = arr[j];
        }
        return ans;
    }
}
