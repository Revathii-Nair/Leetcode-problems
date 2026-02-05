1class Solution {
2
3    int findmax(int[] a)
4    {
5        int max =0;
6        for(int i=0;i<a.length;i++)
7        {
8            if(a[i]>max)
9            {
10                max=a[i];
11            }
12        }
13        return max;
14    }
15
16    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
17        int max = findmax(candies);
18        List<Boolean> ans = new ArrayList();
19        for(int i=0;i<candies.length;i++){
20            if(candies[i]+extraCandies >= max){
21                ans.add(true);
22            }
23            else{
24                ans.add(false);
25            }
26        }
27        return  ans;
28    }
29    
30}