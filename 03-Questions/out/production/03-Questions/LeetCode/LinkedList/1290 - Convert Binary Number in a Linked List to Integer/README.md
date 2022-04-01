## Convert Binary Number in a Linked List to Integer
## [Question 🦋](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/)

## Solution Code :

Notes:
- Simple & Easy Solution (Don't make it complicated)
- Please never ever think of reversing the LL like me ;-;

```java
class Solution {
    public int getDecimalValue(ListNode head) {
        int  num = head.val;

        while(head.next != null){
            num = (num * 2) + head.next.val;
            head = head.next;
        }

        return num;
    }
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤]()