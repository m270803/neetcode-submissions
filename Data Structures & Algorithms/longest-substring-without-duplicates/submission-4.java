class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxCount = 0;
        int count = 0;
        int j = 0;
        for(int i = 0 ; i < s.length() ; i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
                count--;
            }
            set.add(s.charAt(i));
            count++;
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}
