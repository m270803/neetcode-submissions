class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxfreq = 0;
        int left = 0;
        int maxlen = 0;
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(i) - 'A']);
            int windowSize = i - left + 1;
            int elleft = windowSize - maxfreq;
            while (elleft > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
                windowSize = i - left + 1;
                elleft = windowSize - maxfreq;
            }
            maxlen  = Math.max(maxlen,windowSize);
        }
        return maxlen;
    }
}
