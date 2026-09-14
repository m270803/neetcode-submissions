class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        int i = 0;
        for(int nums: nums1){
            arr[i] = nums;
            i++;
        }
        for(int num: nums2){
            arr[i] = num;
            i++;
        }
        Arrays.sort(arr);
        if(arr.length % 2 == 0){
            return (double)(arr[arr.length/2] + arr[arr.length/2 - 1] ) / 2;
        }else {
            return arr[arr.length/2];
        }
    }
}
