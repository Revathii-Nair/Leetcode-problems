1class Solution(object):
2    def furthestDistanceFromOrigin(self, moves):
3        return abs(moves.count('L') - moves.count('R')) + moves.count('_')
4
5        