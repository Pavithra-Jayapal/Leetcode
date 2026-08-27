class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
        maxind,maxi=-1,0
        for i in range(len(nums)):
            if(nums[i]>maxi):
                maxi= nums[i]
                maxind=i
        for num in nums:
            if(maxi<2*num and num!=maxi):
                return -1
        return maxind