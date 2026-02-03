1class Solution {
2    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
3        HashMap<String,Integer> priority = new HashMap<>();
4        priority.put("electronics",0);
5        priority.put("grocery",1);
6        priority.put("pharmacy",2);
7        priority.put("restaurant",3);
8        List<Pair> coupons = new ArrayList<>();
9        List<String> valid_coupons = new ArrayList<>();
10
11        for(int i=0;i<code.length;i++){
12            if(code[i].matches("^[a-zA-Z0-9_]+$") && priority.containsKey(businessLine[i]) && isActive[i]){
13                coupons.add(new Pair(code[i],priority.get(businessLine[i])));
14
15            } 
16        }
17       
18       Collections.sort(coupons,(e1,e2)->{
19        if (e1.priority != e2.priority)
20            return e1.priority-e2.priority;
21        return e1.code.compareTo(e2.code);
22        });
23
24       for(Pair l: coupons){
25        valid_coupons.add(l.code);
26       }
27
28       return valid_coupons;  
29    }       
30
31    static class Pair{
32        String code;
33        int priority;
34
35        Pair(String code,int priority){
36            this.code = code;
37            this.priority = priority;
38        }
39
40    }
41}