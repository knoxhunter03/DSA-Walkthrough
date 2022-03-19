import java.util.Scanner;

public class allSortAlgos {
    private static void bubbleSort1(int[] inputArray){
        int n = inputArray.length;

        for (int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){

                if(inputArray[j+1] < inputArray[j]){

                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }
            }
        }
    }

    private static void inssertionSort2(int[] inputArray){
        int n = inputArray.length;

        for(int i = 1; i < n; i++){
            int temp = inputArray[i];
            int j = i - 1;

            while (j >= 0 && temp < inputArray[j]){
                inputArray[j+1] = inputArray[j];
                j--;
            }

            inputArray[j+1] = temp;
        }
    }

    private static void mergeSort3(int[] inputArray){
        int inputSize = inputArray.length;
        int midIndex = inputSize / 2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputSize - midIndex];

        if(inputSize < 2){
            return;
        }

        for(int i = 0; i < midIndex; i++){
            leftHalf[i] = inputArray[i];
        }

        for(int i = midIndex; i < inputSize; i++){
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort3(leftHalf);
        mergeSort3(rightHalf);

        merge(inputArray, leftHalf, rightHalf);


    }

    public static void merge(int[] inputArray, int[] leftHalf, int[] righHalf){
        int leftSize = leftHalf.length;
        int rightSize = righHalf.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSize && j < rightSize){

            if(leftHalf[i] <= righHalf[i]){
                inputArray[k] = leftHalf[i];
                i++;
            }
            else{
                inputArray[k] = righHalf[j];
                j++;
            }

            k++;
        }
        while (i < leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize){
            inputArray[k] = righHalf[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        System.out.println("****** Given a set of Integers ******");
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = a.length;

        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println("\n--------- Now, Please choose a Sorting Algorithm ---------");
        System.out.println("1. BubbleSort \n2. InsertionSort \n3. MergeSort");
        System.out.println("Enter Choice : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                bubbleSort1(a);
                break;

            case 2:
                inssertionSort2(a);
                break;

            case 3:
                mergeSort3(a);
                break;

            default:
                System.out.println("Ooops! Wrong choice");
                break;
        }

        System.out.println("Sorted list is : ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }


    }
}
