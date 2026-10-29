"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def minMeetingRooms(self, intervals: List[Interval]) -> int:

        n = len(intervals)
        start = [i.start for i in intervals]
        endings = [i.end for i in intervals]
        start.sort()
        endings.sort()

        s = e = 0
        res = count = 0
        while(s < len(intervals)):
            if start[s] < endings[e]:
                count+=1
                s+=1
            else:
                count -=1
                e+=1
            res = max(res,count)
        return res

        