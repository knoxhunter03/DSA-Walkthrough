import java.util.*;

public class stack_Next_Greater_ELemenr_GFG {
    static int arr[] = { 11, 13, 21, 3 };

    /* prints element and NGE pair for all
    elements of arr[] of size n */
    public static void printNGE()
    {
        Stack<Integer> s = new Stack<>();
        int nge[] = new int[arr.length];

        // iterate for rest of the elements
        for (int i = arr.length - 1; i >= 0; i--)
        {
            /* if stack is not empty, then
            pop an element from stack.
            If the popped element is smaller
            than next, then
            a) print the pair
            b) keep popping while elements are
            smaller and stack is not empty */
            if (!s.empty())
            {
                while (!s.empty()
                        && s.peek() <= arr[i])
                {
                    s.pop();
                }
            }
            nge[i] = s.empty() ? -1 : s.peek();
            s.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] +
                    " --> " + nge[i]);
    }

    /* Driver Code */
    public static void main(String[] args)
    {
        // NextGreaterElement nge = new
        // NextGreaterElement();
        printNGE();
    }
}

// Revision :)
