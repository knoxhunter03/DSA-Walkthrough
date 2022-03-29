## Middle of the Linked List
## [Question 🦋](https://leetcode.com/problems/middle-of-the-linked-list/)

## Solution Code :
Note :
- I tried BruteForce Method but it will take _O(N^2)_ Time Complexity
- I'm glad at least I could solve a problem without even looking at the solution
- One **Better Approach is using slow & fast** pointer algo
- When traversing the list with a pointer slow, make another pointer fast that traverses twice as fast. When fast reaches the end of the list, slow must be in the middle.
- Time Complexity 0f Slow & Fast : _O(N)_
```java
// BruteForce
class Solution {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;

        while(head.next != null){
            head = head.next;
            length++;
        }

        int mid = (length + 1) / 2;
        int n = 0;

        while(temp.next != null && n < mid ){
            temp = temp.next;
            n++;
        }

        return temp;

    }
}

// Slow & Fast pointer approach
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤]()