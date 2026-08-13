// Last updated: 8/13/2026, 5:27:43 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set=new HashSet<>();

  for(int i=0;i<nums.length;i++){
    if(!set.contains(nums[i]) ){
        set.add(nums[i]);
        }
        else{
            return true;
    
  }
    }
    return false;  
}
}