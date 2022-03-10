# How to use Queue?
We are implementing Queue using Linked List here

## Stack Methods()
- **offer()** - adds an element in the Queue
- **poll()** - removes the element from front in Queue
- **peek()** - returns the front element of the Queue

## [Video Reference 👆](https://www.youtube.com/watch?v=gC0nghFzLvo&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=30)
## [Video Reference 2 👆](https://www.youtube.com/watch?v=rzA7UJ-hQn4&t=552s)

## Code :

```java
import java.util.LinkedList;
import java.util.Queue;

public class queue_LinkedList2 {
    public static void main(String[] args) {
        Queue<Integer> c = new LinkedList<>();

        c.offer(10); // offer() - adds an element in the Queue
        c.offer(20);
        c.offer(30);
        c.offer(40); // [10, 20, 30, 40]

        System.out.println("Queue elements are: ");
        System.out.println(c);

        System.out.println("The front element is: " + c.peek());
        // peek() - returns the front element of the Queue

        c.poll(); // pop() - removes the element from front in Queue
        c.poll();
        System.out.println("Queue elements after deleting :");
        System.out.println(c);
    }
}

```