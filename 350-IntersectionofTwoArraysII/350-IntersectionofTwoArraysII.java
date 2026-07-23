// Last updated: 7/23/2026, 3:58:19 PM
1class Solution {
2    public int sumOfUnique(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int num:nums){
5            map.put(num,map.getOrDefault(num,0)+1);
6        }
7        int sum=0;
8        for(int num:nums){
9            if(map.get(num)==1){
10                sum+=num;
11            }
12        }
13        return sum;
14    }
15}