// Ascending Oder Sorting Algorithm
public class selectionSort {
    public static void main(String[] args) {
        int a[] = {2,39,10,5,55,7};
        int n = a.length, min;

        // Loop for passes
        for(int i = 0; i < n-1 ; i++){

            min = i;

            // Loop for internal comparison
            for (int j = i + 1; j < n; j++){

                if(a[j] < a[min]){
                    min = j;
                }
            }

            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        System.out.println("Sorted list is : ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
