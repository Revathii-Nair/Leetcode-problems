1class Solution {
2    public int firstUniqChar(String s) {
3        HashMap<Character,Integer> hm = new HashMap<>();
4        int index = s.length();
5        for(char c:  s.toCharArray()){
6            hm.put(c,hm.getOrDefault(c,0)+1);
7        }
8        for(Map.Entry<Character,Integer> e: hm.entrySet())
9        {
10            if(e.getValue()==1)
11            {
12                int x = s.indexOf(e.getKey());
13                if(x<index){
14                    index=x;
15                }
16            }
17        }
18
19        if(index == s.length()){
20            index = -1;
21        }
22
23        return index;
24    }
25}