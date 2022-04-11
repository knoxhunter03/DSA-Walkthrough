import java.util.ArrayList;
import java.util.Stack;

public class stack_Next_Smallest_Element_Left {
    public static void nearestGreaterToLeft(int[] arr){

        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int n = arr.length;
        for(int i = 0; i < n ; i++){
            if(stack.size() == 0){
                arrayList.add(-1);
            }

            else if(stack.size() > 0 && stack.peek() < arr[i]){
                arrayList.add(stack.peek());
            }

            else if(stack.size() > 0 && stack.peek() >= arr[i]){
                while(stack.size() > 0 && stack.peek() >= arr[i]){
                    stack.pop();
                }

                if(stack.size() == 0){
                    arrayList.add(-1);
                }

                else {
                    arrayList.add(stack.peek());
                }
            }

            stack.push(arr[i]);
        }

        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 4};
        nearestGreaterToLeft(array);
    }
}
