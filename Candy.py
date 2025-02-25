class Solution(object):
    def candy(self, ratings):
        arr = [1]*len(ratings)
        for i in range(len(ratings)-1):
            if(ratings[i] < ratings[i+1]):
                arr[i+1] = arr[i] + 1

        for i in reversed(range(1,len(ratings))):
            if(ratings[i] < ratings[i-1] and arr[i] >= arr[i-1]):
                arr[i-1] = arr[i] + 1
        return sum(arr)