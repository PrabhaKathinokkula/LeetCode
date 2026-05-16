// Last updated: 5/16/2026, 10:59:38 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        int num=x;
4        int reverse=0;
5        if(x<0){
6            return false;
7        }
8       while(x!=0){
9        int lD=x%10;
10        reverse=reverse*10+lD;
11         x= x/10;
12       }
13       if(reverse==num){
14        return true;
15       }else{
16        return false;
17       }
18    }
19}