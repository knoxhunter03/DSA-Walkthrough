import java.lang.*;
import java.io.*;
import java.util.*;

public class stackQ1 {
    public static void nextLargerElement(int[] arr, int n)
    {
        // Your code here
        ArrayList<Integer> arrli = new ArrayList<Integer>();
        Stack<Integer> s = new Stack<Integer>();

        for(int i = n - 1; i >= 0; i--){
            if(s.size() == 0){
                arrli.add(-1);
            }

            else if(s.size() > 0 && s.peek() > arr[i]){
                arrli.add(s.peek());
            }

            else if(s.size() > 0 && s.peek() <= arr[i]){
                while(s.size() > 0 && s.peek() <= arr[i]){
                    s.pop();
                }

                if(s.size() == 0){
                    arrli.add(-1);
                }
                else
                    arrli.add(s.peek());
            }

            s.push(arr[i]);
        }

        Collections.reverse(arrli);

        for(int value : arrli){
            System.out.println(arrli);
        }
    }

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();*/

        int[] array = {1, 2, 3, 4};
        int n = array.length;
       /* for(int i = 0; i < n; i++){
            System.out.println("Enter the array elements : ");
            array[i] = sc.nextInt();
        }
*/
        nextLargerElement(array,n);


    }
}

// Revision
