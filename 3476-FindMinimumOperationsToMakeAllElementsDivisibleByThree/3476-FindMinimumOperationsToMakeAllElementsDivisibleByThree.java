// Last updated: 5/14/2026, 11:10:06 PM
class Solution {
    public int minimumOperations(int[] nums) {
     int operations=0;
     for(int i=0;i<nums.length;i++){
        int remainder= nums[i]%3;
        if(remainder !=0){
            operations+=1;
        }
     }
     return operations;
     
    }
}