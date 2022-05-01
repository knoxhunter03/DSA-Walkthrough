## Best Time To Buy & Sell Stock
## [Question 🦋](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

## Solution Code :

```java
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int Profit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice)
                minPrice = prices[i];
            else if(prices[i] - minPrice >= Profit)
                Profit = prices[i] - minPrice;
        }

        return Profit;
    }
}
```
// Revison
## [Stuck? Tap To Watch the Reference Solution ❤](https://www.youtube.com/watch?v=eMSfBgbiEjk&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=12)