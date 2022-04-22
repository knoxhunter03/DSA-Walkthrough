## Pow(x, n)
## [Question 🦋](https://leetcode.com/problems/powx-n/)

## Solution Code :

Easiest Approach :
```java
class Solution {
    public double myPow(double x, int n) {
       double ans = Math.pow(x, n);
       return ans;
    }
}
```

Optimal Approach :
```java
class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long variable = n;
        
        if(variable < 0)
            variable = -1 * variable;
        
        while(variable > 0){
            if(variable % 2 == 1){
                ans = ans * x;
                variable = variable - 1;
            }
            
            if(variable % 2 == 0){
                x = x * x;
                variable = variable / 2;
            }
        }
        
        if(n < 0)
            ans = (double)(1.0) / (double)(ans);
        
        return ans;
    }
}
```

## [Stuck? Tap To Watch the Reference Solution ❤](https://www.youtube.com/watch?v=l0YC3876qxg&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=16)