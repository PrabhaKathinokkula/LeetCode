// Last updated: 5/15/2026, 12:03:16 PM
1class Solution {
2    public List<String> fizzBuzz(int n) {
3        List<String> result = new ArrayList<>();
4        for(int i=1;i<=n;i++){
5            if(i%3==0 && i%5==0)
6            result.add("FizzBuzz");
7            else if(i%3==0)
8             result.add("Fizz");
9            else if(i%5==0)
10             result.add("Buzz");
11            else
12            result.add(String.valueOf(i));
13
14        }
15        return result;
16        
17    }
18}