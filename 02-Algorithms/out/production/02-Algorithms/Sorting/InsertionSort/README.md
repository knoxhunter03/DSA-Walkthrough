# Selection Sort Algorithm
### Time Complexity : O(N²)

#### - It is better than Selection Sort, Selection Sort is better when there is a less number of data

## [Video Reference 👆](https://www.youtube.com/watch?v=Vrg1-ptCRA4&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=54)

## Code :

```java

// Ascending Oder Sorting Algorithm
public class insertionSort {
    public static void main(String[] args) {
        int a[] = {2,39,10,5,55,7};
        int n = a.length, temp;

        for(int key = 1; key < n ; key++){
            temp = a[key];
            int j = key - 1;

            while(temp < a[j] && j >= 0){
                a[j+1] = a[j];
                j = j - 1;
            }
            a[j+1] = temp;
        }

        System.out.println("Sorted list is : ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}

```