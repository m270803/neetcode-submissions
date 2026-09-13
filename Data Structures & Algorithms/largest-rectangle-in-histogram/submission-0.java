class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int area = 0;
        for(int i = 0 ; i < heights.length ; i++){
            while(!s.isEmpty() && heights[i] < heights[s.peek()]){
                area = Math.max(area,maxArea(s,i,heights));
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            area = Math.max(area,maxArea(s,heights.length,heights));
        }
        return area;
    }
    private int maxArea(Stack<Integer> s,int i,int[] height){
        int curr = s.pop();
        int area = 0;
        if(s.isEmpty()){
            area = height[curr] * i;
        }else{
            area = height[curr] * (i-s.peek()-1);
        }
        return area;
    }
}
