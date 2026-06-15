class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] s1count=new int[26];
        int[] s2count=new int[26];

        // Count the frequency of characters in s1 and the first window of s2
        for(int i=0;i<s1.length();i++){
            s1count[s1.charAt(i)-'a']++;
            s2count[s2.charAt(i)-'a']++;
        }

        // Slide the window over s2
        for(int i=0;i<s2.length()-s1.length();i++){
            //update window
            if(matches(s1count,s2count)) return true;
            s2count[s2.charAt(i)-'a']--;
            s2count[s2.charAt(i+s1.length())-'a']++;
        }
        // Check the last window
        return matches(s1count, s2count);
    }

    private boolean matches(int[] s1Count, int[] s2Count) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != s2Count[i]) return false;
        }
        return true;
    }
}