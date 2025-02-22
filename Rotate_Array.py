class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if(len(nums) > 1):
            k = k % len(nums)
            nums.reverse()
            nums[:k] = reversed(nums[:k])
            nums[k:] = reversed(nums[k:])
            

# i = 0
#             j = len(nums)-1
#             while(i < j):
#                 temp = nums[i]
#                 nums[i] = nums[j]
#                 nums[j] = temp
#                 i = i + 1
#                 j = j - 1
#             i = 0
#             j = k-1
#             while(i < j):
#                 temp = nums[i]
#                 nums[i] = nums[j]
#                 nums[j] = temp
#                 i = i + 1
#                 j = j - 1
#             print(nums)
#             i = k 
#             j = len(nums)-1
#             while(i < j):
#                 temp = nums[i]
#                 nums[i] = nums[j]
#                 nums[j] = temp
#                 i = i + 1
#                 j = j - 1