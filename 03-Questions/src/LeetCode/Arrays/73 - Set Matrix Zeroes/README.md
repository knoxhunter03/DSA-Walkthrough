## Set Matrix Zeroes
## [Question 🦋](https://leetcode.com/problems/set-matrix-zeroes/)

## Solution Code :

Bruteforce - Testing (Not final solution)
```java
class Solution {
    public void setZeroes(int[][] matrix) {
        int row = -1, column = -1;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][j] == 0){
                    row = i;
                    column = j;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[row][j] = 0;
                matrix[i][column] = 0;
            }
        }
    }
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤]()