class Solution:
    def countBits(self, n: int) -> List[int]:

        counts = [0]

        for i in range(1, n+1):
            num = i
            count = 0
            while num > 0:
                if num & 1 == 1: 
                    count += 1
                num = num >> 1
            counts.append(count)

        return counts
        