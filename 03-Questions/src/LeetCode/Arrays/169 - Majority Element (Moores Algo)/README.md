## Moore's Algorithm - Majority Element
## [Question 🦋](https://leetcode.com/problems/majority-element/)

## Solution Code :

### Note :
- Use count and element storing method
- If count equals 0, store it in element
- If element equals array element, increase the count
- Else decrease the count

```java
// Moore's Voting Algorithm
class Solution {
    public int majorityElement(int[] a) {
        int count = 0;
        int element = 0;
        
        for(int i = 0; i < a.length; i++){
            if(count == 0)
                element = a[i];
            if(element == a[i])
                count += 1;
            else count -= 1;
        }
        
        return element;
    }
}
```

## [Stuck? Tap To Watch the Reference Solution ❤](https://www.youtube.com/watch?v=AoX3BPWNnoE&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=17)
