1class Solution {
2    public String longestCommonPrefix(String[] s) {
3       StringBuilder ans = new StringBuilder();
4       Arrays.sort(s);
5       String first = s[0];
6       String prev = s[s.length-1];
7       for(int i=0;i<Math.min(first.length(),prev.length()); i++)
8       {
9        if(first.charAt(i)!=prev.charAt(i))
10        {
11            return ans.toString();
12        }
13            ans.append(first.charAt(i));
14        
15       }
16
17       return ans.toString(); 
18    }
19}