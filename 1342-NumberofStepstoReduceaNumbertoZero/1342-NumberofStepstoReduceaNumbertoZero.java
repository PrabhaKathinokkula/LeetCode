// Last updated: 5/15/2026, 11:43:26 PM
1class Solution {
2    public int numberOfSteps(int num) {
3        int count=0;
4        while(num!=0){
5        if(num%2==0){
6           num= num/2;
7        }
8        else{
9       num= num-1;
10        }
11         count++;
12        }
13        return count;
14        
15    }
16}