## Add Two Numbers in Linked List
## [Question 🦋](https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1#)

## Solution Code :

```java
class Solution
{
    public static Node reverse(Node head, int k)
    {
        //Your code here
        if (head == null){
            return head;
        }
        
        Node current = head;
        Node next = null;
        Node prev = null;
        
        int count = 0;
        while(current != null && count < k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            
            count ++;
        }
        
        if(next != null)
            head.next = reverse(next, k);
            
        return prev;
    }
        
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤](https://www.geeksforgeeks.org/reverse-a-list-in-groups-of-given-size/)