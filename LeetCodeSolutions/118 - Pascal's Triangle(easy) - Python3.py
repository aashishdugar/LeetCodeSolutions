class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return [];
        res = [[1]]
        cnt = 2;
        while (cnt <= numRows):
            temp2 = []
            for i in range(len(res[-1])):
                if i == 0:
                    temp2.append(res[-1][i] + 0)
                else:
                    temp2.append(res[-1][i]+res[-1][i-1])
            temp2.append(1)
            res.append(temp2)
            cnt += 1
        return res