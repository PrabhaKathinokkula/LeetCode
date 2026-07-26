// Last updated: 7/27/2026, 2:17:52 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character> set= new HashSet<>();
4        int l=0;
5        int maxLength=0;
6
7        int r=0;
8
9        for(r=0;r<s.length();r++){
10            while(set.contains(s.charAt(r))){
11                set.remove(s.charAt(l));
12                l++;
13            }
14            set.add(s.charAt(r));
15            
16            maxLength= Math.max(maxLength,r-l+1);
17            
18        }
19        
20        return maxLength;
21    }
22}