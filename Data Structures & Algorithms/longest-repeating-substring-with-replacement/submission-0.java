class Solution {
    public int characterReplacement(String s, int k) {
        int start=0;
        int[] freq=new int[26];
        int maxlen=0;
        int maxfreq=0;

        for(int end=0;end<s.length();end++){
            char ch=s.charAt(end);
            freq[ch-'A']++;
            maxfreq=Math.max(maxfreq,freq[ch-'A']);

            while((end-start+1)-maxfreq>k){
                freq[s.charAt(start)-'A']--;
                start++;
            }
            maxlen=Math.max(maxlen,end-start+1);
        }
        return maxlen;
    }
}