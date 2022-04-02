## Design HashSet
## [Question 🦋](https://leetcode.com/problems/design-hashset/)

## Solution Code :

```java
// Simple & Easy Solution
class MyHashSet {

    boolean[] arr;
    public MyHashSet() {
        arr = new boolean[1000001];
    }

    public void add(int key) {
        arr[key] = true;
    }

    public void remove(int key) {
        arr[key] = false;
    }

    public boolean contains(int key) {
        return arr[key];
    }
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤](https://www.youtube.com/watch?v=NrMaQL_4Npo)