// Last updated: 7/11/2026, 8:00:00 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        int n = haystack.length();
4        int m = needle.length();
5
6        for (int i = 0; i <= n - m; i++) {
7            if (haystack.substring(i, i + m).equals(needle)) {
8                return i;
9            }
10        }
11
12        return -1;
13    }
14}