## Delete Node in a Linked List
## [Question 🦋](https://leetcode.com/problems/delete-node-in-a-linked-list/)

## Solution Code :

Notes:
- Sometimes some things can be so simple, we just need strong hold in basic concepts
```java
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤]()