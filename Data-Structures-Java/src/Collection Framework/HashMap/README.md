# HashMap Implementation Using Map Interface
- Map contains two generics(Key, KeyValue)
- Key cannot be repeated
- But we can have duplicate key values

## HashMap Methods()
- **put()** - adds key value pairs in E.g. put(1,"A")
- **putIfAbsent()** - first checks the value at key, if empty then inserts the given value
## [Video Reference 👆](https://youtu.be/gC0nghFzLvo?list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su)

## Code :

```java
import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        Map<Integer, String> c = new HashMap<>(); // Map<> uses two generics
        // Stores value in form of key pairs

        c.put(1,"A");
        c.put(2,"B");
        c.put(3,"C");
        c.put(4,"D");

        System.out.println("HashMap elements are :");
        System.out.println(c);

        c.put(3,"OG");
        System.out.println("Now if we implenet put() method - it will overwrite the exisiting key value");
        System.out.println(c);

        c.putIfAbsent(4,"E");
        System.out.println("Let's try using putifAbsent() for 4 keypair");
        System.out.println(c);

        System.out.println("\nPrinting all the key elements only");
        for(Integer d: c.keySet()){
            System.out.println(d);
        }

        System.out.println("\nPrinting all the key values now");
        for(String d: c.values()){
            System.out.println(d);
        }
    }
}

```