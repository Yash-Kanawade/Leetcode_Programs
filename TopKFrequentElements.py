import heapq
class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        table = {}
        for i in nums:
            if i not in table:
                table[i] = 1
            else:
                table[i] = table[i] + 1
        pq = []
        for v in table.values():
            heapq.heappush(pq,v)
            if AQlen(pq)>k:
                heapq.heappop(pq)
        j = 0
        print(pq)
        list1 = []
        for k,v in table.items():
            if v in pq:
                list1.append(k)
        return list1

        
        
        