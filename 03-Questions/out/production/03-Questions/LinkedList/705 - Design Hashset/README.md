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

// Own Implementation with LinkedList
class MyHashSet {
    private final int MAX_SIZE = 1000000;
    private final int ARRAY_SIZE = 100;

    private List<List<Integer>> parentList;

    public MyHashSet() {
        parentList = new ArrayList<>(ARRAY_SIZE);
        for(int i = 0; i < ARRAY_SIZE; i++){
            parentList.add(null);
        }
    }

    public void add(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);

        if(childList == null){
            List<Integer> list = new LinkedList<>();
            list.add(key);
            parentList.set(index, list);
        }
        else{
            if(!childList.contains(key))
                childList.add(key);
        }
    }

    public void remove(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);

        if(childList != null){
            childList.remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);

        return childList != null && childList.contains(key);
    }
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤](https://www.youtube.com/watch?v=NrMaQL_4Npo)