// Last updated: 8/13/2026, 5:26:57 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
       int l=0;
       int n=nums.length;
       int index=n-1;
       int r=n-1;

       int[] result=new int[n];

       while(l<=r){
        int lsquare= nums[l]*nums[l];
        int rsquare=nums[r]*nums[r];
       
       if(lsquare > rsquare){
        result[index]= lsquare;
        l++;
       }else {
        result[index]= rsquare;
        r--;
       }

       index--;



     }
     return result;
        
       
    }
}