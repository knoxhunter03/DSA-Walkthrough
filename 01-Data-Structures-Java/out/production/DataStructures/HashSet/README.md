# HashSet Implementation
- Unordered set of elements
- Stored in hashtable
- Doees not allow duplicates as two data cannot have same hashvalues

## HashSet Methods()
- Almost same as ArrayList
- Except get() & set() because HashSet contains elements in Unordered se
- **We cannot use get() & set()**
## [Video Reference 👆](https://youtu.be/gC0nghFzLvo?list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su)

## Code :

```java
import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Set<Integer> value = new HashSet<>(); // Syntax of HashSet

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

        //  value.set(0, 99); We cannot use set and get in HashSet

        value.add(40);
        value.add(50);

        boolean flag = value.contains(40);
        System.out.println(flag);

        value.clear(); // clear() - It clears all the elements in ArrayList making it empty
        System.out.println("All the elements are cleared now");
        System.out.println(value);
    }
}

```