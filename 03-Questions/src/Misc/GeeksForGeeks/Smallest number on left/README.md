## Smallest number on left
## [Question 🦋](https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1/#)

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
// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
   public static void main(String args[])throws IOException
   {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(in.readLine());
      while(t-- > 0){
         int n = Integer.parseInt(in.readLine());
         String a1[] = in.readLine().trim().split("\\s+");
         int a[] = new int[n];
         for(int i = 0;i < n;i++)
            a[i] = Integer.parseInt(a1[i]);
         Solution ob = new Solution();
         List<Integer> ans = new ArrayList<Integer>();
         ans = ob.leftSmaller(n, a);
         for(int i = 0;i < n;i++)
            System.out.print(ans.get(i)+" ");
         System.out.println();
      }
   }
}// } Driver Code Ends


//User function Template for Java
class Solution{
   static List<Integer> leftSmaller(int n, int a[])
   {
      //code here
      Stack<Integer> s = new Stack<Integer>();
      List<Integer> arrayList = new ArrayList<Integer>();

      for(int i = 0; i < n; i++){
         if(s.size() == 0){
            arrayList.add(-1);
         }

         else if(s.size() > 0 && s.peek() < a[i]){
            arrayList.add(s.peek());
         }

         else if(s.size() > 0 && s.peek() >= a[i]){
            while(s.size() > 0 && s.peek() >= a[i]){
               s.pop();
            }

            if(s.size() == 0)
               arrayList.add(-1);

            else
               arrayList.add(s.peek());
         }

         s.push(a[i]);
      }

      return arrayList;
   }
}
```

## [Best way to Approach & Solution Explained ❤](https://www.youtube.com/watch?v=T5s96ynzArg&list=PL_z_8CaSLPWdeOezg68SKkeLN4-T_jNHd&index=3)