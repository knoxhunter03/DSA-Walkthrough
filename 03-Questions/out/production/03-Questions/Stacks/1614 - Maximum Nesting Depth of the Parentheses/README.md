## Maximum Nesting Depth of the Parentheses
## [Question 🦋](https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/)

## Solution Code :
Notes :
- It's a Hard Question, Please Revise the Algorithm again!
```java
class Solution {
    public int maxDepth(String s) {
        int current_max = 0;
        int max = 0;

        int n = s.length();

        for(int i = 0; i < n; i++){

            if(s.charAt(i) == '('){

                current_max++;

                if(current_max > max)
                    max = current_max;

            }
            else if(s.charAt(i) == ')' ){

                if(current_max > 0)
                    current_max--;

                else
                    return -1;
            }

        }

        return max;
    }
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤](https://www.youtube.com/watch?v=IOQi3aJFIaM)