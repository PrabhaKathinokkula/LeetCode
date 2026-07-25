// Last updated: 7/25/2026, 11:37:11 PM
1class Solution {
2    public void reverseString(char[] s) {
3        int left=0;
4        int right=s.length-1;
5        for(int i=0;i<s.length-1;i++){
6            
7                while(left<right){
8                   char temp=s[left];
9                    s[left]=s[right];
10                    s[right]=temp;
11                    left++;
12                    right--;
13            
14                }
15            
16            
17
18        }
19        
20    }
21}