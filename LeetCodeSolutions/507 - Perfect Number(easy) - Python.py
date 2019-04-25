class Solution(object):
    def checkPerfectNumber(self,num):
	if num <= 0: return False
	sqrt = int(num ** 0.5)
	cand = sum(i + num // i for i in range(2, sqrt + 1) if not num % i)
	if num == sqrt ** 2: cand -= sqrt
	return cand + 1 == num