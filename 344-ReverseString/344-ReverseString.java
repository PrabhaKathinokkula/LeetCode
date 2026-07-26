// Last updated: 7/27/2026, 12:35:01 AM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3       int l=0;
4       int n=nums.length;
5       int index=n-1;
6       int r=n-1;
7
8       int[] result=new int[n];
9
10       while(l<=r){
11        int lsquare= nums[l]*nums[l];
12        int rsquare=nums[r]*nums[r];
13       
14       if(lsquare > rsquare){
15        result[index]= lsquare;
16        l++;
17       }else {
18        result[index]= rsquare;
19        r--;
20       }
21
22       index--;
23
24
25
26     }
27     return result;
28        
29       
30    }
31}