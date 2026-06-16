1class Solution(object):
2    def checkStraightLine(self, coordinates):
3        if len(coordinates) == 2:
4            return True
5        x1,y1 = coordinates[0]
6        x2,y2 = coordinates[1]
7        for i in range(2,len(coordinates)):
8            x,y = coordinates[i]
9            if (x2 - x1)*(y- y2) != (y2 - y1)*(x- x2):
10                return False
11        return True