// Last updated: 8/13/2026, 5:28:03 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int x:nums){
            result = result ^ x;
        }
        return result;
        
    }
}