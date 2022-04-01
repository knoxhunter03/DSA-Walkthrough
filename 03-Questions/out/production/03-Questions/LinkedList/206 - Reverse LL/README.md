## Reverse Linked List
## [Question 🦋](https://leetcode.com/problems/reverse-linked-list/)

## Solution Code :

```java
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
                return true;
        }
        
        return false;
    }
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤]()