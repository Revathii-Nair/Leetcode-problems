1class Solution(object):
2    def mergeAlternately(self, word1, word2):
3        word =""  
4        for i in range(max(len(word1),len(word2))):
5            if i <len(word1):
6                word = word+word1[i]
7            if i <len(word2):
8                word = word+word2[i]  
9        return word
10
11        