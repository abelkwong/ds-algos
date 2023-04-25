# Singly linked list
class Node:
    def __init__(self, val):
        self.val = val
        self.next = next

# Doubly linked list
class Node:
    def __init__(self, val):
        self.val = val
        self.next = next
        self.prev = prev

# Access: O(n)
# Search: O(n)
# Insertion: O(1)*
# Deletion: O(1)*
# * = assumes we have reference to node at desired position

# Queues
from collections import queues, deques

# Enqueues
def enqueue(self, val):
    newNode = ListNode(val)

    # Non-empty queue
    if self.right:
        self.right.next = newNode
        self.right = self.right.next

    # Empty queue
    else:
        self.left = self.right = newNode

# Dequeues
def dequeue(self):

    # Empty queue
    if not self.left:
        return None
    
    # Remove left node and return value
    val = self.left.val
    self.left = self.left.next
    if not self.left:
        self.right = None
    return val

# Enqueue: O(1)
# Dequeue: O(1)

# Example 1

students = [1,1,0,0]
sandwiches = [0,1,0,1]

def countStudents(self, students, sandwiches):
    """
    :type students: List[int]
    :type sandwiches: List[int]
    :rtype: int
    """

    count = 0
    while count != len(students):
        if students[0] == sandwiches[0]:
            students.pop(0)
            sandwiches.pop(0)
            count = 0
        else:
            students.append(students.pop(0))
            count += 1

    return len(students)