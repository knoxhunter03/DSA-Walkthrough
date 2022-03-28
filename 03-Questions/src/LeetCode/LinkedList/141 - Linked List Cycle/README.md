## Linked List Cycle
## [Question 🦋](https://leetcode.com/problems/linked-list-cycle/)

## Solution Code :
-  Floyd Cycle Detection Algorithm

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

## [Stuck? Tap To Watch the Refernece Solution ❤](https://www.youtube.com/watch?v=jcZtMh_jov0&t=89s)