class Solution:
    def addDigits(self, num: int) -> int:
         return num if num < 10 else self.addDigits(num//10 + num%10)
          