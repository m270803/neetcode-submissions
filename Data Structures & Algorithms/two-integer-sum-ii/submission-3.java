class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j = 0 ; j < numbers.length ; j++){
            if(map.containsKey(target-numbers[j])){
                return new int[]{map.get(target-numbers[j]),j+1};
            }
            map.put(numbers[j],j+1);
        }
        return new int[]{-1,-1};
    }
}
