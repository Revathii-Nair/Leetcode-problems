1class Solution {
2    public int mostWordsFound(String[] sentences) {
3        int max=0;
4        for(int i=0;i<sentences.length;i++)
5        {
6            String[] sentence = sentences[i].split(" ");
7            if(sentence.length>max)
8            {
9                max=sentence.length;
10            }
11        }
12        return max;
13        
14    }
15}