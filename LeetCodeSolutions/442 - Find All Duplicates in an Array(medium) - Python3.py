class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        return [k for k,v in dict(collections.Counter(nums)).items() if v == 2]