// Last updated: 7/26/2026, 11:43:58 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int l=0;
4        int r=s.length()-1;
5            while(l<=r){
6                while(l<r && !Character.isLetterOrDigit(s.charAt(l)) ){
7                    l++;
8                  
9                }
10                while(l<r && !Character.isLetterOrDigit(s.charAt(r)) ){
11                    r--;
12                }
13                int left=Character.toLowerCase(s.charAt(l));
14                int right=Character.toLowerCase(s.charAt(r));
15
16                if(left != right){
17                    return false;
18                }
19                 l++;
20                r--;
21
22        
23                 
24
25            }
26             return true;
27        
28        
29    }
30}