class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        
        skup =  set(nums)
        
        return len(skup)<len(nums)