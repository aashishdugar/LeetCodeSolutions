class Solution:
    def lengthOfLastWord(self, s: str) -> int:
          if len(s.strip()) == 0:
            return 0
          else:
            return len(s.strip().split(' ')[-1])