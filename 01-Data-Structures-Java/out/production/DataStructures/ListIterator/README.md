# ListIterator
## [Video Reference 👆](https://www.youtube.com/watch?v=gC0nghFzLvo&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=30&t=1376s)

## Code :

```java
import java.util.LinkedList;
import java.util.ListIterator;

public class listIterator {
    public static void main(String[] args) {
        LinkedList<Integer> c = new LinkedList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);

        ListIterator<Integer> d = c.listIterator();

        System.out.println("Forward traversing :");
        while (d.hasNext()){
            System.out.println(d.next());
        }

        System.out.println("\nBackward traversing :");
        while (d.hasPrevious()){
            System.out.println(d.previous());
        }
    }
}

```