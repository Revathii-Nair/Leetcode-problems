1class Solution {
2    public int percentageLetter(String s, char letter) {
3       HashMap<Character,Integer> hm = new HashMap<>();
4
5       for(int i=0;i<s.length();i++)
6       {
7         char c = s.charAt(i);
8         hm.put(c,hm.getOrDefault(c,0)+1);
9       } 
10
11       int value = hm.getOrDefault(letter,0);
12       if(value!=0){
13        return 100*value/s.length();
14       }
15       return 0;
16    }
17}