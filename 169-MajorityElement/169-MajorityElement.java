// Last updated: 8/13/2026, 6:29:35 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int count=0;
4        int n=0;
5        for(int x:nums){
6            if(count==0){
7                n=x;
8            }
9            if(x==n){
10                count++;
11            }else{
12                count--;
13            }
14        }
15        return n;
16    }
17}