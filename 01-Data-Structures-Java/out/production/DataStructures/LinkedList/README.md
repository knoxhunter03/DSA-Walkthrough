# How to use LinkedList?

## LinkedList Methods()
###All the Methods & Implementation are same as _ArrayList_
- **add()** - adds element in LinkedList
- **get()** - returns the value at index in LinkedList
- **remove()** - deletes the value at index in LinkedList
- **set()** - replaces the value of **existing elements** at given index in LinkedList
- **contains()** - it checks whether a given element is present in LinkedList
- **clear()** - It clears all the elements in LinkedList making it empty

## [Video Reference 👆](https://www.youtube.com/watch?v=YW2mcHBvn4c&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=29)
## [Video Reference 2 👆](https://www.youtube.com/watch?v=rzA7UJ-hQn4&t=552s)

## Code :

```java
import java.util.LinkedList;
import java.util.List;

public class linkedList_CollectionFramework {
    public static void main(String[] args) {
        LinkedList<Integer> value = new LinkedList<>(); // Syntax of LinkedList
        // Integer generics used here

        value.add(10); // add() - adds element in LinkedList
        value.add(20);
        value.add(30);

        System.out.println("Added Elements: ");
        System.out.println(value); // It prints ellements in list format
        // [10, 20, 30]

        int c = value.get(2); // get() - returns the value at index in LinkedList
        System.out.println("Element at index 2 : " + c);

        value.remove(2); // remove() - deletes the value at index in LinkedList
        System.out.println("Elements after removing the element at 2nd index");
        System.out.println(value);

        value.set(0, 99); // set() - adds the value of **existing elements** at given index in LinkedList
        System.out.println("Again after adding element at 0th index, it becomes:");
        System.out.println(value);

        value.add(40);
        value.add(50);

        boolean flag = value.contains(40); // contains() - it checks whether a given element is present in LinkedList or not
        System.out.println(flag);

        value.clear(); // clear() - It clears all the elements in LinkedList making it empty
        System.out.println("All the elements are cleared now");
        System.out.println(value);
    }
}

```