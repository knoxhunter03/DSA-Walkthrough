// https://www.youtube.com/watch?v=D0Bi0wxXh-4&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=20

import java.util.Scanner;

// Static Stack Using Array of size n, i.e. n = 10
class stack{
    int top = -1; // top has the index of the element
    int n = 10; // n here refers to size of the array
    int a[] = new int[n];

    void push(){
        if(top == (n-1)){
            System.out.println("Underflow Condition!");
        }
        else{
            System.out.println("Enter the data: ");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            top++;
            a[top] = i;
            System.out.println("Item inserted!");
        }
    }

    void pop(){
        if(top == -1){
            System.out.println("Overflow Condition!");
        }
        else{
            top--;
            System.out.println("Item deleted!");
        }
    }

    void show(){
        System.out.println("Items are: ");
        // Printing elements from TOP to BOTTOM
        for(int j = top; j >= 0; --j){
            System.out.println(a[j]); //
        }
    }

}
public class stack_Array {
    public static void main(String[] args) {
        int  choice, l;
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        do{
            System.out.println("Press 1 to PUSH elements");
            System.out.println("Press 2 to POP elements");
            System.out.println("Press 3 to DISPLAY elements");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    s.push();
                    break;

                case 2:
                    s.pop();
                    break;
                case 3:
                    s.show();
                    break;
            }

            System.out.println("Press 0 to go back to MAIN MENU");
            System.out.println("ENTER ANY NUMBER TO EXIT.");
            l = sc.nextInt();
        }while (l==0);
        System.out.println("EXIT SUCCESSFULLY");
    }
}
