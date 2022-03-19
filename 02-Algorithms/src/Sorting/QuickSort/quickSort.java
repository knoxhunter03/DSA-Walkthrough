public class quickSort {
    static int partition(int a[], int start, int end){
        int pivot = a[end];
        int pindex = start;

        for(int i = start; i < end ; i++){
            if (a[i] < pivot) {

                int temp = a[pindex];
                a[pindex] = a[i];
                a[i] = temp;

                pindex++;


            }
        }

        int temp = a[pindex];
        a[pindex] = a[end];
        a[end] = temp;

        return (pindex);
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
