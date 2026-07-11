// Last updated: 7/11/2026, 8:09:13 PM
1class Solution {
2    public int mySqrt(int x) {
3        if (x == 0 || x == 1) {
4            return x;
5        }
6
7        int left = 1;
8        int right = x;
9        int ans = 0;
10
11        while (left <= right) {
12            int mid = left + (right - left) / 2;
13
14            if ((long) mid * mid == x) {
15                return mid;
16            } else if ((long) mid * mid < x) {
17                ans = mid;
18                left = mid + 1;
19            } else {
20                right = mid - 1;
21            }
22        }
23
24        return ans;
25    }
26}