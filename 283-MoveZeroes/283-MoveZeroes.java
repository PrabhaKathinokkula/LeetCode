// Last updated: 7/23/2026, 11:02:48 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3    int index=0;
4    int n=nums.length;
5    for(int i=0;i<n;i++){
6            if(nums[i]!=0){
7            int temp=nums[i];
8            nums[i]=nums[index];
9            nums[index]=temp;
10            index++;
11            }
12    
13    }
14    }
15}