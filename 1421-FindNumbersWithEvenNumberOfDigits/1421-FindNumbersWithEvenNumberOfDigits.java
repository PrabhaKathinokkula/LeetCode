// Last updated: 5/14/2026, 11:10:21 PM
class Solution {
    public int findNumbers(int[] nums) {
        int evenCount=0;
        for(int x:nums){
            int digitCount=String.valueOf(x).length();
            if(digitCount%2==0){
                evenCount+=1;
            }
        }
        return evenCount;
        
    }
}