## Pascal's Triangle
## [Question 🦋](https://leetcode.com/problems/pascals-triangle/)

## Solution Code :

### Note :
2 other types of questions are also explained in the reference.

### Optimal Solution :
```java
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row, prev = null;

        for(int i = 0; i < numRows; i++){
            row = new ArrayList<Integer>();

            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i)
                    row.add(1);

                else
                    row.add(prev.get(j-1) + prev.get(j));
            }

            prev = row;
            ans.add(row);
        }


        return ans;
    }
}
```

## [Stuck? Tap To Watch the Refernece Solution ❤](https://www.youtube.com/watch?v=6FLvhQjZqvM&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=9)
