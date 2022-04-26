## Sort Colors or Dutch Flag Algorithm
## [Question 🦋](https://leetcode.com/problems/sort-colors/)

## Solution Code :

```java
class Solution {
    // ---- Dutch National Flag Algorithm ---
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp;

        while(mid <= high){
            switch(nums[mid]){
                case 0: {
                    // Swap low & mid
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;

                    low++;
                    mid++;
                    break;
                }

                case 1: {
                    mid++;
                    break;
                }

                case 2: {
                    // Swap mid & high
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;

                    high--;
                    break;
                }
            }
        }

    }


}
```

// Revision

## [Stuck? Tap To Watch the Refernece Solution ❤](https://www.youtube.com/watch?v=oaVa-9wmpns&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=3)
