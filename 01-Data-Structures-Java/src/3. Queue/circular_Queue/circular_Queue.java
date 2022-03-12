import java.util.Scanner;

// https://www.youtube.com/watch?v=XLqyJz7_kVE&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=27&t=777s
// Circular Queue using Array
class Queue1{
    int front = -1, rear = -1;
    int n = 10;
    int a[] = new int[n];

    void enQueue(){
        if(front == (rear + 1)%n){
            System.out.println("Overflow Condition!");
        }
        else{
            System.out.println("Enter the data: ");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();

            if(front == -1 && rear == -1){
                front = 0;
                rear = 0;
                a[rear] = i;
            }
            else {
                rear = (rear+1)%n; // This condN is very very important to insert elements
                a[rear] = i;
            }

            System.out.println("Item added!");
        }
    }

    void deQueue(){
        // ** 2 conditions to be check
        if(front == -1 && rear == -1){
            System.out.println("Underflow Condition!");
        }
        else if(front == rear){
            System.out.println("Underflow Condition!");
            front = -1;
            rear = -1;
        }
        else{
            front = (front+1)%n;
            System.out.println("Item deleted!");
        }

    }

    void display(){
        System.out.println("Items are :");
        int j;
        for( j = front; j != rear; j = (j+1)%n){ // **** Important for loop concept
            System.out.println(a[j]);
        }
        System.out.println(a[j]); // As front == rear would terminate the for loop
                                  // So we have to print the rear part value also
    }
}
public class circular_Queue {
    public static void main(String[] args) {
        int choice, n;
        Queue1 Q = new Queue1();

        System.out.println("---------Circular Queue----------");

        do{
            System.out.println("Press 1 to Enqueue");
            System.out.println("Press 2 to Dequeue");
            System.out.println("Press 3 to Display");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    Q.enQueue();
                    break;
                case 2:
                    Q.deQueue();
                    break;
                case 3:
                    Q.display();
                    break;
            }

            System.out.println("Press 0 to go back to main menu");
            System.out.println("Enter any number to EXIT");
            n = sc.nextInt();
        }while (n==0);
    }
}
