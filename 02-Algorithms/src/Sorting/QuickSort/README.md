# QuickSort Algorithm
### Time Complexity :
#### - Best Case  : O(N log N)
#### - Worst Case : O(N²)
## [Video Reference 👆](https://www.youtube.com/watch?v=t8pWc_6JChg&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=55)

## Code :

```java
public class quickSort {
    static int partition(int a[], int start, int end){
        int pivot = a[end];
        int pindex = start - 1;

        for(int i = start; i <= end - 1; i++){
            if (a[i] < pivot) {

                pindex++;

                int temp = a[pindex];
                a[pindex] = a[i];
                a[i] = temp;


            }
        }

        int temp = a[pindex+1];
        a[pindex+1] = a[end];
        a[end] = temp;

        return (pindex+1);
    }

    static void quickSortAlgo(int a[], int start, int end){
        if(start < end){
            int p = partition(a, start, end);
            quickSortAlgo(a,start,p-1);
            quickSortAlgo(a,p+1, end);
        }
    }
    public static void main(String[] args) {
        int a[] = {2,39,10,5,55,7};
        int n = a.length;

        quickSortAlgo(a,0,n-1);

        System.out.println("Sorted list is : ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}

```