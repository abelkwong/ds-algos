# Factorial (recursive implementation)
def factorial(n):
    # base case: n = 0 or 1
    if n <= 1:
        return 1
    
    # recursive case: n! = n * (n - 1)!
    return n * factorial(n - 1)

# Time complexity: O(n)
# Space complexity: O(n)
# Note 1: recursions operate off of a stack
# Note 2: recursions can be written iteratively (vv)

# Fibonacci sequence
def fibonacci(n):
    # base case: n = 0 or 1
    if n <= 1:
        return n
    
    # recursive case: fib(n) = fib(n-1) + fib(n-2)
    return fibonacci(n-1) + fibonacci(n-2)


