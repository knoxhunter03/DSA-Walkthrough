# HashMap Implementation Using Map Interface
- Same as HashMap but data is stored in ordered way
- **Map + BST**

## [Video Reference 👆](https://youtu.be/gC0nghFzLvo?list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su)

## Code :
```java
import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        Map<Integer, String> c = new TreeMap<>(); // Map<> uses two generics
        // Stores value in form of key pairs

        c.put(3,"C");
        c.put(2,"B");
        c.put(4,"D");
        c.put(1,"A");
        

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