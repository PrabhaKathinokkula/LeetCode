// Last updated: 7/27/2026, 1:40:08 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!= t.length()){
4            return false;
5        }
6
7    int[] arr=new int[26];
8    for(int i=0;i<s.length();i++){
9        arr[s.charAt(i) - 'a']++;
10        arr[t.charAt(i) - 'a']--;
11    }
12        for(int i=0;i<arr.length;i++){
13        if(arr[i] != 0){
14            return false;
15        }
16        }
17        return true;
18    }
19}