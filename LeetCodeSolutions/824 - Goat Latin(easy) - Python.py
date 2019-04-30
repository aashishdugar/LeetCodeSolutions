class Solution(object):
    def toGoatLatin(self, S):
        """
        :type S: str
        :rtype: str
        """
        res=[]
        slist= S.split()
        for i in range(len(slist)):
            if slist[i][0] in 'aeiouAEIOU':
                res.append(slist[i]+'ma'+(i+1)*'a')
            else:
                res.append(slist[i][1:]+slist[i][0]+'ma'+(i+1)*'a')

            result= " ".join(res)
        
        return result