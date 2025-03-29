class Solution(object):
    def GCD(self,a,b):
        max_val = 0
        s = 0
        if a < b:
            s = a
        else:
            s = b
        for i in range(1,s+1):
            if a % i == 0 and b % i == 0:
                max_val = i
        return max_val

    def LCM(self,a,b):
        lcm = int((a*b)/self.GCD(a,b))
        return lcm

    def LCM_a(self,brr):
        if not brr:
            return 1
        lcm = brr[0]
        for i in range(1, len(brr)):
            lcm = self.LCM(lcm, brr[i])
        return lcm

    def GCD_a(self,brr):
        if not brr:
            return 1
        gcd = brr[0]
        for i in range(1,len(brr)):
            gcd = self.GCD(gcd,brr[i])
        return gcd


    def Product(self,nums):
        mul = 1
        for i in nums:
            mul *= i
        return mul

    def maxLength(self,nums):
        max_val = 0
        for i in range(len(nums)):
            for j in range(i,len(nums)):
                subarray = nums[i:j+1]
                if not subarray:
                    continue
                if self.Product(subarray) == (self.LCM_a(subarray)*self.GCD_a(subarray)):
                    max_val = max(max_val,len(subarray))
        return max_val

