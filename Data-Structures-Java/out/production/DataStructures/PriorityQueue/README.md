# How to implement Priority Queue
It can be implemented using Collection Framework
- **By default** - it uses _Min Heap_ Concept to print the data
- To use _Max Heap_ Concept we need to make modification in syntax as shown in code below **Comparator.reverseOrder()**
## [Video Reference 👆](https://www.youtube.com/watch?v=gC0nghFzLvo&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=30)

## Code :

```java
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        System.out.println("Priority Queue---Min Heap---Concept");
        Queue<Integer> c = new PriorityQueue<>();
        c.offer(100);
        c.offer(22);
        c.offer(39);
        c.offer(400);
        // *** It won't print [100, 22, 39, 400]
        // It will print [22, 100, 39, 400]

        System.out.println("Queue elements are: ");
        System.out.println(c);

        c.poll();
        System.out.println("\nAfter deletion : ");
        System.out.println(c);

        System.out.println("\nPriority Queue---Max Heap---Concept");
        // *** To use max heap concept we use Comparator.reverseOrder()
        Queue<Integer> d = new PriorityQueue<>(Comparator.reverseOrder());
        d.offer(100);
        d.offer(22);
        d.offer(39);
        d.offer(400);
        // *** It won't print [100, 22, 39, 400]
        // It will print [22, 100, 39, 400]

        System.out.println("Queue elements are: ");
        System.out.println(d);

        d.poll();
        System.out.println("\nAfter deletion : ");
        System.out.println(d);
    }
}

```

## Output :
![PriorityQUEUEimg]()