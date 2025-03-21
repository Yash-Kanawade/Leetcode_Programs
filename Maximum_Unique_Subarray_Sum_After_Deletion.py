class Solution(object):
    def maxSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums2 = []
        for i in nums:
            if i not in nums2:
                nums2.append(i)
        sums = nums2[0]
        for i in range(1,len(nums2)):
            if (sums + nums2[i] > sums)and (nums2[i] + sums > nums2[i]):
                sums = nums2[i] + sums
            elif sums < nums2[i]:
                sums = nums2[i]
        return sums
            


