// Last updated: 7/27/2026, 1:08:15 AM
1class Solution {
2    public static int[] twoSum(int[] nums,int target){
3          HashMap<Integer,Integer> map=new HashMap<>();
4
5     for(int i=0;i<nums.length;i++){
6        int c=target-nums[i];
7        if(map.containsKey(c)){
8            return new int[]{map.get(c),i};
9        }
10        map.put(nums[i],i);
11
12
13     }
14     return new int[] {};
15
16    }
17}
18
19
20       /* for(int i=0;i<nums.length;i++){
21            for(int j=i+1;j<nums.length;j++){
22                if(nums[i]+nums[j]==target){
23                    return new int[] {i,j};
24                }
25
26            }
27        }
28        return new int[] {};
29    }
30        public static void main(String[] args){
31            int[] nums={2,7,11,15};
32            int target=9;
33            int[] result=twoSum(nums,target);
34            System.out.println("Indices:["+result[0]+","+result[1]+"]");
35        } */
36    
37