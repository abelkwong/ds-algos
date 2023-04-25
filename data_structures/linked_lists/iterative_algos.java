// linked lists

public class Node {
    public int item;
    public Node next;

    Node() {
        item = 0;
        next = null;
    }

    Node(int n) {
        item = n;
        next = null;
    }

    Node(int n, Node p) {
        item = n;
        next = p;
    }
};

// declares an empty list
Node head = null;

// create a list with one item (5)
head = new Node();
head.item = 5;
head.next = null; // OR head = new Node(5);

// add node containing 5 to front of an existing list
head = new Node();
head.item = 5;
head.next = list; // OR head = new Node(5, list);

// splice a node into a middle of an existing list
Node q = new Node();
q.item = 5;
q.next = p.next; 
p.next = q; // OR p.next = new Node(5, p.next);


// add to front of list
void addToFront(int n) {
    head = new Node(n, head);
}

// remove the first node in list
int removeFront() {
    int temp = head.item;
    head = head.next;
    return temp;
}

// basic chaining to access each element of a list
// for loop
for (Node p = head; p != null; p = p.next) {
    // Do something with each node such as print out the item
}

// while loop
Node p = head;
while (p != null) {
    // Do something with each node such as print out the item
    p = p.next;
}

// printing list
void printList() {
    System.out.println("head -> ");
    for(Node p = head; p != null; p = p.next) {
        System.out.println(p.item + " -> ");
    }
    System.out.println(".");
}

// producing a string representation of a list
public String toString() {
    String s = "head -> ";
    for(Node p = head; p != null; p = p.next) {
        s += (p.item + " -> ");
    }
    return s + ".";
}

// finding the length of a list
int length() {
    int len = 0;
    for(Node p = head; p != null; p = p.next) {
        len++;
    }
    return len;
} 

// find the sum of the list
int sum() {
    int sum = 0;
    for(Node p = head; p != null; p = p.next) {
        sum += p.item;
    }
    return sum;
}

// find the average of list
double avg() {
    int sum = 0;
    int len = 0;
    for(Node p = head; p != null; p = p.next) {
        sum += p.item;
        len++;
    }
    return double(sum / len);
}

// find last number in list
int lastNumber() {
    int last;
    for(Node p = head; p != null; p = p.next) {
        if p.next == null {
            last = p;
        }
    }
    return last;
}

// finding first negative number
Node q = null;
for(Node p = head; p != null && p.item >= 0; p = p.next) {
    q = p;
}

// point to 100th node in list
Node p = null;
counter = 0;
for(Node q = head; q != null && counter < 100; q = q.next) {
    p = q;
    counter++;
}

// delete first node in list that's negative
void deleteNegative() {
    if (head == null);
    else if (head < 0) {
        head = head.next;
    }
    else {
        Node q = head;
        Node p = head.next;
        while (p != null) {
            if (p.item < 0) {
                q.next = p.next;
            }
            q = p;
            p = p.next;
        }
    }
}

// Alternative
void deleteNegative() {
    if (head == null);
    else if (head < 0) {
        head = head.next;
    }
    else {
        for(Node q = head, Node p = head.next; p != null; q = p, p = p.next) {
            if (p < 0) {
                q.next = p.next;
                break;
            }
        }
    }
}

// Accessing the end of a list
Node head = null;
Node last = null;

void addToEnd(int n) {
    if (head == null) {
        head = new Node(n, null);
        last = head;
    }
    else {
        last.next = new Node(n, null);
        last = last.next;
    }
}

// delete negative with parameter h
Node deleteNegative(Node h) {
    if(h == null) {
        return null;
    }
    else {
        Node p = h.next;
        Node q = h;
        while (p != null) {
            q.next = p.next;
            break;
        }
        q = p;
        p = p.next;
    }
}

/* ITERATIVE ALGOS */

// print list
void printList() {
    System.out.println("head -> ");
    for (Node p = head; p! = null; p = p.next) {
        System.out.println(p.item + " -> ");
    }
    System.out.println(".");
}

// finding length of list

int length(Node h) {
    int count = 0;
    for (Node p = h; p != null; p = p.next)
    count++;
}

// find whether number is in list or not
boolean member(int n, Node h) {
    for (Node p = h; p != null; p = p.next) {
        if (p.item == n) {
            return true;
        }
    return false;
    }
}

// looking up a item
Node find(int n, Node h) {
    for (Node p = h; p != null; p = p.next) {
        if (p.item == n) {
            return p;
        }
    return null;
    }
}

// deleting an item in a list
Node delete(int n, Node h) {
    if (h == null) {
        return null;
    }
    else if (h.item == n) {
        return h.next;
    }
    for(Node p = h.next, Node q = h; p != null; q = p, p = p.next) {
        if (p.item == n) {
            q.next = p.next;
            return h;
        }
    }
}

// inserting an item into a sorted list
Node insertInOrder(int n, Node h) {
    if (h == null) {
        return new Node(n, h);
    }
    else if (h.item >= n) {
        return new Node(n, h);
    }
    else {
        Node p = h.next;
        Node q = h;
        while (p != null) {
            if (p.item >= n) {
                q.next = new Node(n, p);
                return h;
            }
            q = p;
            p = p.next;
        }
    q.next = new Node(n, null);
    }
}

// copying a list
Node copyList(Node h) {
    Node p = h;
    if (p == null) {
        return null;
    }
    else {
        Node q = new Node(p.item);
        Node prev = q;
        p = p.next;
        while (p != null) {
            prev.next = new Node(p.item);
            prev = prev.next;
            p = p.next;
        }
        return q;
    }
}

// reversing a node list in place

Node reverse(Node h) {
    if (h == null) {
        return null;
    }
    Node p = h.next;
    Node q = h;
    Node r;
    while (p != null) {
        r = q;
        q = p;
        p = p.next;
        q.next = r;
    }
    h.next = null;
    return q;
}

// reversing a list (by creating a new list)
Node reverse2(Node h) {
    if(h == null) {
        return null;
    }
    Node q = null;
    for (int p = h; p != null; p = p.next) {
        q = new Node(p.item, q);
    }
    return q; 
}

// reversing a doubly linked list
Node reverseDouble (Node h) {
    Node ptr1 = head;
    Node ptr2 = ptr1.next;

    ptr1.next = null;
    ptr1.prev = ptr2;

    while (ptr2 != null) {
        ptr2.prev = ptr2.next;
        ptr2.next = ptr1;
        ptr1 = ptr2;
        ptr2 = ptr2.prev;
    }
    head = ptr1;
    return head;
}


public class Node {
    int val;
    Node next;

    Node() {
        val = 0;
        next = null;
    }

    Node(int n) {
        val = n;
        next = null;
    }

    Node(int n, Node p) {
        val = n;
        next =
    }
}

public linkedList(Node head) {
    head.val = 45;
    head.next = null;

    Node curr;
    curr.val = 95;
    curr.next = null;
    head.next = curr;

    curr.val = 3;
    curr.next = null;
    head.next.next = curr;
}