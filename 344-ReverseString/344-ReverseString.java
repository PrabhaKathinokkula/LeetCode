// Last updated: 7/27/2026, 12:50:10 AM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3    HashSet<Integer> set=new HashSet<>();
4
5  for(int i=0;i<nums.length;i++){
6    if(!set.contains(nums[i]) ){
7        set.add(nums[i]);
8        }
9        else{
10            return true;
11    
12  }
13    }
14    return false;  
15}
16}