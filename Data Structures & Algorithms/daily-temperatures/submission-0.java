class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0 ; i < temperatures.length ; i++){
            while(!s.isEmpty() && temperatures[i] > temperatures[s.peek()]){
                int index = s.pop();
                res[index] = i - index;
            }
            s.push(i);
        }
        return res;
    }
}
