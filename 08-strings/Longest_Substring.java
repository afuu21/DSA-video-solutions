// Video link: https://youtu.be/i0J3yKuPfhc
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mpp = new HashMap<Character, Integer>();
        int left=0, right=0;
        int len=0;
        int n = s.length();
        
        while(right<n) {
            if(mpp.containsKey(s.charAt(right)))
                left = Math.max(mpp.get(s.charAt(right))+1, left);
            mpp.put(s.charAt(right), right);
            len = Math.max(len, right-left+1);
            right++;
        }
        return len;
    }
}