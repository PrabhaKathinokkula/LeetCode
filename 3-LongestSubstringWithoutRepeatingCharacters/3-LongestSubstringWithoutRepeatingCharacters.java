// Last updated: 8/13/2026, 5:28:52 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set= new HashSet<>();
        int l=0;
        int maxLength=0;

        int r=0;

        for(r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            
            maxLength= Math.max(maxLength,r-l+1);
            
        }
        
        return maxLength;
    }
}