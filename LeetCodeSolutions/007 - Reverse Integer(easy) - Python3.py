class Solution:
    def reverse(self, x: int) -> int:
        s=0
        y=abs(x)
        while (y!=0):
        
            t = y % 10
            s = s * 10 + t
            y = y // 10
        lim=2 ** 31-1
        if abs(x) > lim: return 0
        if abs(s) > lim: return 0
        if x!=0: return int(x/abs(x)*s)
        return 0
        