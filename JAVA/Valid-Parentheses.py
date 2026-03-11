1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack();
4        for(char c : s.toCharArray())
5        {
6            if(!stack.isEmpty())
7            {
8                char peek = stack.peek();
9                if(checkPair(c,peek))
10                {
11                    stack.pop();
12                    continue;
13                }
14            }
15            stack.push(c);
16        }
17        return stack.isEmpty();   
18    }
19
20    private boolean checkPair(char  cur, char last)
21    {
22        return (cur == ')' && last =='(') || 
23               (cur == ']' && last =='[') || 
24               (cur == '}' && last =='{') ;
25    }
26}