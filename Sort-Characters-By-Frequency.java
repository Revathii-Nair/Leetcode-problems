1class Solution {
2    public String frequencySort(String s) {
3        HashMap<Character,Integer> hm = new HashMap<>();
4        for(char c: s.toCharArray()){
5            hm.put(c,hm.getOrDefault(c,0)+1);
6        }
7
8        int n = hm.size();
9        int j=0;
10        int[] l = new int[n];
11        for(int value: hm.values())
12        {
13            l[j++]= value;
14        } 
15
16        Arrays.sort(l);
17        StringBuilder sb = new StringBuilder();
18        for(int i=n-1;i>=0;i--){
19           for(Map.Entry<Character,Integer> c : hm.entrySet()){
20            int value = c.getValue();
21            if(value == l[i]){
22                sb.append(String.valueOf(c.getKey()).repeat(c.getValue()));
23                hm.put(c.getKey(),0);
24            }
25           }
26        }
27
28        return sb.toString();
29
30
31
32
33
34        // ArrayList<Map.Entry<Character,Integer>> l = new ArrayList<>(hm.entrySet());
35        // l.sort((e1,e2)-> e2.getValue()-e1.getValue());
36        // //Collections.sort(l,(e1,e2)-> e2.getValue()-e1.getValue());
37        // StringBuilder sb = new StringBuilder();
38        // for(Map.Entry<Character,Integer> c: l){
39        //     for(int i=0;i<c.getValue();i++)
40        //     sb.append(c.getKey());
41        // }
42        // return sb.toString();
43    }
44}