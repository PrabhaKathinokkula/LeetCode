// Last updated: 8/13/2026, 5:28:42 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    //     List<List<Integer>> result=new ArrayList<>();
        
    //   for(int i=0;i<nums.length-2;i++){
    //     for(int j=i+1;j<nums.length-1;j++){
    //         for(int k=j+1;k<nums.length;k++){
               
    //          int  sum = nums[i]+nums[j]+nums[k];
    //             if(sum==0){
    //                 List<Integer> tri= new ArrayList<>();
    //               tri.add(nums[i]);
    //                 tri.add(nums[j]);
    //                 tri.add(nums[k]);

    //                 Collections.sort(tri);

    //               if(!result.contains(tri)){
    //                 result.add(tri); 
    //               }
    
    //             }
    //         }
        
    //   }
        
    // }
    // return result;


List<List<Integer>> result= new ArrayList<>();

Arrays.sort(nums);
for(int i=0;i<nums.length-1;i++){
    if(i>0 && nums[i]==nums[i-1]){
        continue;
    }
int j=i+1;
int k=nums.length-1;
while(j<k){
    int sum=nums[i]+nums[j]+nums[k];
    if(sum==0){
        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
        j++;
        k--;
        while(j<k && nums[k]==nums[k+1]){
        k--;
        }
        while(j<k && nums[j]==nums[j-1]){
        j++;
    }
    }else if(sum>0){
        k--;
    }else if(sum<0 ){
        j++;
    }
}
}
    
return result;

    }
}