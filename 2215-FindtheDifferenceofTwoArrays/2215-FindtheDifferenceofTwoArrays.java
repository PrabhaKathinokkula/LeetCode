// Last updated: 7/23/2026, 11:57:34 AM
1class Solution {
2    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
3        HashSet<Integer> set1=new HashSet<>();
4        HashSet<Integer> set2=new HashSet<>();
5 List<List<Integer>> re=new ArrayList<>();
6re.add(new ArrayList<>());
7re.add(new ArrayList<>());
8
9        for(int i : nums1){
10            set1.add(i);
11        }
12        for(int num : nums2){
13            set2.add(num);
14        }
15  for(int i:set1){
16    if(!set2.contains(i)){
17        re.get(0).add(i);
18    }
19    
20  }
21  for( int i:set2){
22    if(!set1.contains(i)){
23        re.get(1).add(i);
24    }
25  }
26  return re;
27    }
28}