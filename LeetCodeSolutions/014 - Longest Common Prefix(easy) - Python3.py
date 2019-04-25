class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        val = ''
        for args in zip(*strs):
            if all(arg==args[0] for arg in args):
                val += args[0]
            else:
                break
        return val