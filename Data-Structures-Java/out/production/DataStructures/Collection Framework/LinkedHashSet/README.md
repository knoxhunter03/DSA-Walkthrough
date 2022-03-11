# LinkedHashSet Implementation
- **LinkedList + Set**
- Ordered Collection
- It stores data in HashTable
- But is implemented using LinkedList
- check the printing of data in both HashSet & LinkedHashSet to know the difference

## HashSet Methods()
- Almost same as ArrayList
- Except get() & set() 
- **We cannot use get() & set()**
## [Video Reference 👆](https://youtu.be/gC0nghFzLvo?list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su)

## Code :

```java
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet {
    public static void main(String[] args) {

        Set<Integer> value = new LinkedHashSet<>(); // Syntax of LinkedHashSet

        value.add(10);
        value.add(20);
        value.add(30);
        value.add(99);
        value.add(69);

        System.out.println("Added Elements: ");
        System.out.println(value);

        value.remove(20);
        System.out.println("Elements after removing 20");
        System.out.println(value);

        value.add(40);
        value.add(50);

        boolean flag = value.contains(40);
        System.out.println(flag);

        value.clear();
        System.out.println("All the elements are cleared now");
        System.out.println(value);
    }
}

```