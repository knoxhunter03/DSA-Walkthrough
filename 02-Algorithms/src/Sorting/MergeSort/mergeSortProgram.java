public class mergeSortProgram {
    private static void mergeSort(int inputArray[]){
        int inputLength = inputArray.length;

        if (inputLength < 2){
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex]; // Case for odd number of elements

        for(int i = 0; i < midIndex; i++){
            leftHalf[i] = inputArray[i];
        }

        for(int i = midIndex; i < inputLength; i++){
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merge the arrays
        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftArray, int[] rightArray){
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0; // to track leftArray
        int j = 0; // to track rightArray
        int k = 0; // to track of the mergeArray

        while (i < leftSize && j < rightSize){

            if(leftArray[i] <= rightArray[i]){
                inputArray[k] = leftArray[i];
                i++;
            }
            else {
                inputArray[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while (i < leftSize){
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize){
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int a[] = {2,39,10,5,55,7};
        int n = a.length;

        System.out.println("Before Sorting: ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }

        mergeSort(a);

        System.out.println("\nAfter Sorting : ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
