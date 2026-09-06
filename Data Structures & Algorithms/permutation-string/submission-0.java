class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int a = s1.length();
        int b = s2.length();
        for(int i = 0 ; i < a ; i++){
            freq1[s1.charAt(i)-'a']++;
        }
         for(int j = 0 ; j < a ; j++){
            freq2[s2.charAt(j)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)) return true;
        for(int k = a ; k < b ; k++){
            freq2[s2.charAt(k)-'a']++;
            freq2[s2.charAt(k-a) - 'a']--;
            if(Arrays.equals(freq1,freq2)) return true;
        }   
        return false;    
    }
}
