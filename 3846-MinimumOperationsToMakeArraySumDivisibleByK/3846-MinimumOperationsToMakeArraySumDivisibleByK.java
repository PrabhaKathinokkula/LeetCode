// Last updated: 5/14/2026, 11:10:11 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
       
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
         
        return sum%k;

    }
        
    }
