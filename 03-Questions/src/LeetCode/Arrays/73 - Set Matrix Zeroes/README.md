## Set Matrix Zeroes
## [Question 🦋](https://leetcode.com/problems/set-matrix-zeroes/)

## Solution Code :

### Note : 
Please go through the video to understand the code properly!

### Optimal Solution :
```java
class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1, row = matrix.length, column = matrix[0].length;

        for(int i = 0; i < row; i++){
            if(matrix[i][0] == 0) col0 = 0;

            for(int j = 1; j < column; j++){
                if(matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;

            }

        }

        for(int i = row - 1; i >= 0; i--){
            for(int j = column - 1; j >= 1; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }

            if(col0 == 0)
                matrix[i][0] = 0;

        }
    }
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤](https://www.youtube.com/watch?v=M65xBewcqcI&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=8)