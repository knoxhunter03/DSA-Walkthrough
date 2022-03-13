# Binary Search Algorithm
## Points to Remeber!
- Before implementing check, Data must be  **Sorted** 
- Sorted ---> Binary Search Algo
- Unsorted ---> Sorting Algo  ----> Binary Search Algo

## [Video Reference 👆](https://www.youtube.com/watch?v=ZgjXzwqjYWM&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=51)

## Code :

```java
import java.util.Scanner;

public class binearySearch {
    public static void main(String[] args) {
        int a[], n, item, c = 0;
        int beg, end, mid = 0;

        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];

        System.out.println("Enter the elements in sorted way :");
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        item = sc.nextInt();

        beg = 0;
        end = n -1;

        while (end >= beg){

            mid = (beg+end)/2;

            if(item == a[mid]){
                c++;
                break;
            }

            else if(item > a[mid]){
                beg = mid + 1;
            }

            else if(item < a[mid]){
               end = mid - 1;
            }

        }

        if(c>0){
            System.out.println("Item found at " + (mid+1) + "position");
        }
        else {
            System.out.println("Item not found!");
        }

    }
}

```