## Add Two Numbers in Linked List
## [Question 🦋](https://leetcode.com/problems/add-two-numbers/)

## Solution Code :

```java
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode();
        ListNode temp = newHead;
        
        int carry = 0;
        
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;
            
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            
            sum += carry;
            carry = sum / 10;
            
            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        
        return newHead.next;
    }
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤](https://www.youtube.com/watch?v=LBVsXSMOIk4)