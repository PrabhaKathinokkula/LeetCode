// Last updated: 7/11/2026, 7:58:35 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if (nums.length == 0) {
4            return 0;
5        }
6
7        int k = 1;
8
9        for (int i = 1; i < nums.length; i++) {
10            if (nums[i] != nums[k - 1]) {
11                nums[k] = nums[i];
12                k++;
13            }
14        }
15
16        return k;
17    }
18}