// Last updated: 7/11/2026, 8:02:42 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int length = 0;
4        int i = s.length() - 1;
5
6        while (i >= 0 && s.charAt(i) == ' ') {
7            i--;
8        }
9
10        while (i >= 0 && s.charAt(i) != ' ') {
11            length++;
12            i--;
13        }
14
15        return length;
16    }
17}