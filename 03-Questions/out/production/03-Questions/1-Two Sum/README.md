## Two Sum
## [Question 🦋](https://leetcode.com/problems/two-sum/)

## Solution Code :

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length ; j++ ){

                if(nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }

        return new int[]{-1, -1};
    }
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤](https://www.tutorialcup.com/leetcode-solutions/two-sum-leetcode-solution.htm)