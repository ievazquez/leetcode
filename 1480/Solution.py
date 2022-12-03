class Solution:

    def runningSum(self, nums: List[int]) -> List[int]:
        result = [0] * len(nums)
        for (index, r) in enumerate(nums):
            result[index] = nums[index]
            for j in range(index):
                result[index] += nums[j]
        return result

    def runningSum1(self, nums: List[int]) -> List[int]:
        for i in range(1, len(nums)):
            nums[i] += nums[ i - 1]
        return nums

