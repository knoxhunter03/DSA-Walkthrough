# How to use ArrayList?

## ArrayList Methods()
- **add()** - adds element in ArrayList
- **get()** - returns the value at index in ArrayList
- **remove()** - deletes the value at index in ArrayList
- **set()** - replaces the value of **existing elements** at given index in ArrayList
- **contains()** - it checks whether a given element is present in ArrayList
- **clear()** - It clears all the elements in ArrayList making it empty

## [Video Reference 👆](https://www.youtube.com/watch?v=YW2mcHBvn4c&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=29)
## [Video Reference 2 👆](https://www.youtube.com/watch?v=rzA7UJ-hQn4&t=552s)

## Code :

```java
import java.util.ArrayList;
import java.util.List;

// https://www.youtube.com/watch?v=YW2mcHBvn4c&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=29
public class arrayList {

    public static void main(String[] args) {

        List<Integer> value = new ArrayList<>(); // Syntax of ArrayList
                                                // Integer generics used here

        value.add(10); // add() - adds element in ArrayList
        value.add(20);
        value.add(30);

        System.out.println("Added Elements: ");
        System.out.println(value); // It prints ellements in list format
        // [10, 20, 30]

        int c = value.get(2); // get() - returns the value at index in ArrayList
        System.out.println("Element at index 2 : " + c);

        value.remove(2); // remove() - deletes the value at index in ArrayList
        System.out.println("Elements after removing the element at 2nd index");
        System.out.println(value);

        value.set(0, 99); // set() - adds the value of **existing elements** at given index in ArrayList
        System.out.println("Again after adding element at 0th index, it becomes:");
        System.out.println(value);

        value.add(40);
        value.add(50);

        boolean flag = value.contains(40); // contains() - it checks whether a given element is present in ArrayList or not
        System.out.println(flag);

        value.clear(); // clear() - It clears all the elements in ArrayList making it empty
        System.out.println("All the elements are cleared now");
        System.out.println(value);


    }

}

```