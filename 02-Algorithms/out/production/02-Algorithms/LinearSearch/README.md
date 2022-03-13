# Linear Search Algorithm

## Time Complexity / T(n)
### Worst Case : O(n)
### Best Case : O(1)

## [Video Reference 👆](https://youtu.be/oZZ8gNP4V1g?list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su)

## Code :

```java
import java.util.Scanner;

// https://www.youtube.com/watch?v=oZZ8gNP4V1g&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=50
public class linearSearch {
    public static void main(String[] args) {
        int a[], n, item;

        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];

        System.out.println("Enter the elements :");
        for (int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        item = sc.nextInt();

        for(int i = 0; i < a.length ; ++i){
            if(a[i] == item){
                System.out.println("Item exists!");
                System.out.println("Position : " + (i+1));
                break;
            }
            else {
                System.out.println("Oops, Item not found!");
                break;
            }
        }
    }
}

```