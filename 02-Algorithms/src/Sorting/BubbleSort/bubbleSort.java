import java.util.Scanner;

public class bubbleSort {

    public static void main(String[] args) {
        int a[] = {2,39,10,5,55,69};
        int n = a.length;

        // Loop for passes
        for(int i = 0; i < n-1 ; i++){

            // Loop for internal comparison
            for (int j = 0; j < n-i-1; j++){

                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }
        }

        System.out.println("Sorted list is : ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
