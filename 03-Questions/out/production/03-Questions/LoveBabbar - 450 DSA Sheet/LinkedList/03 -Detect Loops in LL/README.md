## Detect Loop in Linked List
## [Question 🦋](https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1)

## Solution Code :

```java
class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return true;
            }
        }
        
        return false;
    }
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤](https://www.youtube.com/watch?v=jcZtMh_jov0&t=89s)