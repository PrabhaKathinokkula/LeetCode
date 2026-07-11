// Last updated: 7/11/2026, 7:56:32 PM
1import java.util.Stack;
2
3class Solution {
4    public boolean isValid(String s) {
5        Stack<Character> stack = new Stack<>();
6
7        for (char ch : s.toCharArray()) {
8            if (ch == '(') {
9                stack.push(')');
10            } else if (ch == '[') {
11                stack.push(']');
12            } else if (ch == '{') {
13                stack.push('}');
14            } else {
15                if (stack.isEmpty() || stack.pop() != ch) {
16                    return false;
17                }
18            }
19        }
20
21        return stack.isEmpty();
22    }
23}