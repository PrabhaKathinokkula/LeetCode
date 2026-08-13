// Last updated: 8/13/2026, 5:26:33 PM
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
 List<List<Integer>> re=new ArrayList<>();
re.add(new ArrayList<>());
re.add(new ArrayList<>());

        for(int i : nums1){
            set1.add(i);
        }
        for(int num : nums2){
            set2.add(num);
        }
  for(int i:set1){
    if(!set2.contains(i)){
        re.get(0).add(i);
    }
    
  }
  for( int i:set2){
    if(!set1.contains(i)){
        re.get(1).add(i);
    }
  }
  return re;
    }
}