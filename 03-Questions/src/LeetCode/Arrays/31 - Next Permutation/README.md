## Next Permutation
## [Question 🦋](https://leetcode.com/problems/next-permutation/)

## Optimal Approach (3 Steps)
- Check A[i] < A[i + 1], say it as index1 
- Find another index say index2 such that, A[index2] > A[index1]
- Swap(A[index1], A[index2])
- reverse(index1 + 1, A.length - 1)

Note : All should be done by traversing backwards only!!

## Solution Code :

```java
class Solution {
    public void nextPermutation(int[] nums) {

        if(nums == null || nums.length <= 1) // If Array is empty then return
            return;

        int i = nums.length - 2; // The 2nd last element can be the break point

        while(i >= 0 && nums[i] >= nums[i+1]){ // To check condn 1, we will write reverse to 
            // stop the loop at the required point
            i--;
        }

        if( i >= 0){
            int j = nums.length - 1;
            while(nums[j] <= nums[i])
                j--;

            swap(nums, i, j);
        }

        reverse(nums, i + 1, nums.length - 1); // Reverse from that first index we got after 
        // swapping (the breakpoint)
    }

    public void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public void reverse(int[] A, int i, int j){
        while(i < j){
            swap(A, i++, j--);
        }
    }
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤](https://www.youtube.com/watch?v=LuLCLgMElus&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=10)