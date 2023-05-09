# Kadanes Algorithm
# Time complexity: O(n)
def kadanes(nums):
    maxSum = nums[0]
    curSum = 0
    
    for n in nums:
        curSum = max(curSum, 0)
        curSum += n
        maxSum = max(maxSum, curSum)
    return maxSum

# Sliding Window 
def slidingWindow(nums):
    maxSum = nums[0]
    curSum = 0
    maxL, maxR = 0, 0
    L = 0
    
    for R in range(len(nums)):
        if curSum < 0:
            curSum = 0
            L = R

        curSum += nums[R]
        if curSum > maxSum:
            maxSum = curSum
            maxL, maxR = L, R
    
    return [maxL, maxR]

# Sliding window(fixed)
# Close duplicates
def closeDuplicates(nums, k):
    window = set()
    L = 0
    
    for R in range(len(nums)):
        if R - L + 1 > k:
            window.remove(nums[L])
            L += 1
        if nums[R] in window:
            return True
        window.add(nums[R])
        
    return False

# Sliding window (variable)
# Longest subarray with same value
def longestSubarray(nums):
    length = 0
    L = 0
    
    for R in range(len(nums)):
        if nums[L] != nums[R]:
            L = R
        length = max(length, R - L + 1)
    return length

# Sliding window (variable)
# Minimum length subarray where sum is greater than or equal to the target (asume all values are positive)
def shortestSubarray(nums, target):
    L, total = 0, 0
    length = float("inf")
    
    for R in range(len(nums)):
        total += nums[R]
        while total >= target:
            length = min(R - L + 1, length)
            total -= nums[L]
            L += 1
    return 0 if length == float("inf") else length

