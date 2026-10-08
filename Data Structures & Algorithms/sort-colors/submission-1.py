class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = 0 # pointer on beg og ones
        j = len(nums)-1 # pointer on end of ones
        k = 0

        def swap(i, j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp

    

        while k<=j:

            if nums[k]==0:
                swap(i, k)
                i+=1
            elif nums[k]==2:
                swap(k,j)
                j-=1
                k-=1
            k+=1

        