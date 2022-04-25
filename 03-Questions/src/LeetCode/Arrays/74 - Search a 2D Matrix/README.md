## Search A 2D Matrix
## [Question 🦋](https://leetcode.com/problems/search-a-2d-matrix/)

## Solution Code :

### Note :
- Use Binar Search Method
- Learn how to access row & column index of an element in matrix
- using " / " & " % "

```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        
        int m = matrix.length; // row Index
        int n = matrix[0].length; // column Index
        
        int low = 0;
        int high = (m * n) - 1;
        
        while(low <= high){
            int mid = (low + (high - low) / 2);
            
            // mid / column = row Index
            // mid % column = column Index
            if(matrix[mid/n][mid%n] == target)
                return true;
            else if(matrix[mid/n][mid%n] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return false;
    }
}
```
// Revision

## [Stuck? Tap To Watch the Reference Solution ❤](https://www.youtube.com/watch?v=ZYpYur0znng&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=15)