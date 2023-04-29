# 69. Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well. (No built in functions like pow(x, 0.5) in c++ and x ** 0.5 in python)

# Example
# Input: x = 4
# Output: 2
# Explanation: The square root of 4 is 2, so we return 2.

def mySqrt(x: int) -> int:
    l, r = 0, x
    while l <= r:
        m = (l+r) // 2
        if m ** 2 < x:
            l = m + 1
        elif m ** 2 > x:
            r = m - 1
        else:
            return m
    return r


# 35. Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

# You must write an algorithm with O(log n) runtime complexity.

# Input: nums = [1, 3, 5, 6], target = 5
# Output: 2

def searchInsert(nums: list[int], target: int) -> int:
    l, r = 0, len(nums) - 1
    while l <= r:
        m = (l+r) // 2
        if nums[m] < target:
            l = m + 1
        elif x[m] > target:
            r = m - 1
        else:
            return m
    return l