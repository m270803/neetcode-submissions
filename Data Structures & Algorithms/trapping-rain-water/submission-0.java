class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = height.length-1;
        int waterMax = 0;
        while(left<right){
            if(height[left]<height[right]){
            if(height[left] >= height[leftMax]){
                
                leftMax = left;
                left++;
            }else{
                waterMax += height[leftMax] - height[left];
                left++;
            }
            }else{
            if(height[right] >= height[rightMax]){
                
                rightMax = right;
                right--;
            }else{
                waterMax += height[rightMax] - height[right];
                right--;
            }               
            }
        }
        return waterMax;
    }
}
