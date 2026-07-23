// Last updated: 7/23/2026, 10:08:19 AM
1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int sum=0;
4        int n=mat.length;
5        for(int i=0;i<n;i++){
6            for(int j=0;j<n;j++){
7                if(i==j ||i+j==n-1){
8                    sum+=mat[i][j];
9                }
10            }
11        }
12        return sum;
13        
14    }
15}