class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        nums_dict = dict(zip(nums, range(len(nums))))
        for i, x in enumerate(nums):
            xx = target - x
            if xx in nums_dict and nums_dict[xx] != i:
                return [i, nums_dict[xx]]
        return 'None'