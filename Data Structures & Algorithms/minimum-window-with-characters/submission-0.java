
class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int start=-1,count=0,needed=t.length(),left=0,minlen=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                    count++;
                }
                map.put(ch,map.get(ch)-1);
            }
            while(count==needed){
                if(minlen>right-left+1){
                    minlen=right-left+1;
                    start=left;
                }
                char leftchar=s.charAt(left);
                if (map.containsKey(leftchar)) {
                    map.put(leftchar, map.get(leftchar) + 1);
                    // Check if this character is now missing
                    if (map.get(leftchar) > 0) {
                        count--;
                    }
                }
                left++;
            }
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
    }
}