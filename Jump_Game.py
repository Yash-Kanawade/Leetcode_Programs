class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        loc = len(nums)-1
        if(len(nums) == 1):
            return True
        for i in reversed(range(len(nums))):
            if(i != loc):
                if(nums[i] >= (loc-i)):
                    loc = i
                    if(loc == 0):
                        return True
        return False