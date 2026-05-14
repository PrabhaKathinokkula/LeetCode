// Last updated: 5/14/2026, 11:10:15 PM
class Solution {
    public int[] buildArray(int[] nums) 
    {
        int[] ans=new int[nums.length];
        int x;
        for(int i=0;i<nums.length;i++)
        {
            x=nums[i];
            ans[i]=nums[x];
        }
        return ans;
        
    }
}