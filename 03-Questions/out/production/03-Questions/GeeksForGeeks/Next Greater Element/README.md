## Next Greater Element
## [Question 🦋](https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1/)

## Solution Code :
Notes :
1. Bruteforce Approach : Take two for loops where i = 0 & j = i + 
   or we can say "**j depends on i**"
2. When a case arises where _j depends on i or there are 2 for loops,_ then 
most chances are there that a Stack can be used to optimize the solution
3. H**ow To Identify if any Data Structure is going to be used?**
4. Ans : j depends on i (for loop) 
5. Refer to video below by Aditya Verma to get a concise idea!

```java
class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        Stack<Long> s = new Stack<Long>();
        long[] output = new long[n];

        for(int i = n - 1; i >= 0; i--){
            if(s.size() == 0){
                output[i] = -1;
            }

            else if(s.size() > 0 && s.peek() > arr[i]){
                output[i] = s.peek();
            }

            else if(s.size() > 0 && s.peek() < arr[i]){
                while(s.size() > 0 && s.peek() < arr[i]){
                    s.pop();
                }

                if(s.size() == 0)
                    output[i] = -1;

                else
                    output[i] = s.peek();
            }

            s.push(arr[i]);
        }

        return output;

    }
}
```

## [Best way to Approach & Solution Explained ❤](https://www.youtube.com/watch?v=NXOOYYwpbg4&list=PL_z_8CaSLPWdeOezg68SKkeLN4-T_jNHd&index=2)