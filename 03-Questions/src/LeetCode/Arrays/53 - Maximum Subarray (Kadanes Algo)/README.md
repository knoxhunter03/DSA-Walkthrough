## Maximum Subarray or Kadane's Algorithm
## [Question 🦋](https://leetcode.com/problems/maximum-subarray/)

## Solution Code :

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(sum > maxSum)
                maxSum = sum;
            if(sum < 0)
                sum = 0;
        }

        return maxSum;
    }
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤](https://www.youtube.com/watch?v=w_KEocd__20&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=6)