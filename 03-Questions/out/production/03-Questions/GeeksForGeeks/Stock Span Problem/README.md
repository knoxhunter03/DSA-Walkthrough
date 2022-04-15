## Stock Span Problem
## [Question 🦋](https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1/)

## Solution Code :
Notes :
1. Bruteforce Approach : Take two for loops where i = 0 & j = i +
   or we can say "**j depends on i**"
2. When a case arises where _j depends on i or there are 2 for loops,_ then
   most chances are there that a Stack can be used to optimize the solution
3. H**ow To Identify if any Data Structure is going to be used?**
4. Ans : j depends on i (for loop)
5. Refer to video below by Aditya Verma to get a concise idea!

##Java Solution :
```java

class Solution
{
   //Function to calculate the span of stockâ€™s price for all n days.
   public static int[] calculateSpan(int price[], int n)
   {
      // Your code here
      Stack<Integer> s = new Stack<>();
      int[] indexArray = new int[n];

      for(int i = 0; i < n; i++){
         if(s.size() == 0){
            indexArray[i] = i+1;
         }

         else if(s.size() > 0 && price[s.peek()] > price[i]){
            indexArray[i] = i - s.peek();
         }

         else if(s.size() > 0 && price[s.peek()] <= price[i]){
            while(s.size() > 0 && price[s.peek()] <= price[i]){
               s.pop();
            }

            if(s.size() == 0){
               indexArray[i] = i+1;
            }

            else
               indexArray[i] = i - s.peek();
         }

         s.add(i);
      }



      return indexArray;
   }

}
```
##C++ Solution : 
```cpp
class Solution
{
    public:
    //Function to calculate the span of stockâ€™s price for all n days.
    vector <int> calculateSpan(int price[], int n)
    {
       // Your code here
       stack<pair<int, int>> s;
       vector<int> v ;
       
       for(int i = 0; i < n; i++){
           if(s.size() == 0){
               v.push_back(-1);
           }
           
           else if(s.size() > 0 && s.top().first > price[i]){
               v.push_back(s.top().second);
           }
           else if(s.size() > 0 && s.top().first <= price[i]){
               while(s.size() > 0 && s.top().first <= price[i]){
                   s.pop();
               }
               
               if(s.size() == 0){
                  v.push_back(-1);
               }
               else
                 v.push_back(s.top().second);
           }
           
           s.push({price[i], i});
       }
       
       for(int i = 0; i < v.size(); i++){
           v[i] = i - v[i];
       }
       
       return v;
    }
};
```


## [Best way to Approach & Solution Explained ❤](https://www.youtube.com/watch?v=p9T-fE1g1pU&t=1356s)
## [Reference 2](https://www.javatpoint.com/stock-span-problem)