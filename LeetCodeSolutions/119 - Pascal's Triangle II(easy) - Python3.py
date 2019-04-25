class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        if rowIndex == 0:
            return [1];
        res = [1]
        cnt = 2;
        while (cnt <= rowIndex+1):
            temp2 = []
            for i in range(len(res)):
                if i == 0:
                    temp2.append(res[i] + 0)
                else:
                    temp2.append(res[i]+res[i-1])
            temp2.append(1)
            res = temp2
            cnt += 1
            
        return res