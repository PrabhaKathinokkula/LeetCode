// Last updated: 7/27/2026, 2:31:53 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int low=0;
4        int high=nums.length-1;
5        while(low<=high){
6            int mid=low + (high-low)/2;
7            if(nums[mid] == target){
8                return mid;
9            }else if(nums[mid] >target){
10                high=mid-1;
11            }else{
12                low=mid+1;
13            }
14
15        
16        }
17        return -1;
18        
19    }
20}