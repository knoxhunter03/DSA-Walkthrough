# Queue Using Array (Implementation)
### Queue Uses:
1. CPU Scheduling (OS)
2. Seat Reservation
3. Movie Tickets Booking Queue


### Queue Major Terms:
- **Underflow** : When _**front == -1 && rear == -1**_, Queue is empty!
- **Overflow** : When _**rear == (n-1)**_, Queue is full! { 'n' is the size of the Static Array here}
- **Enqueue** : Inserting an elemnet in Queue **(i.e from rear end)**
- **Dequeue** : Deleting an element from Queue **(i.e. from front end only)**
- **Display or Show** : Traversal of elements
## [Video Reference 👆](https://www.youtube.com/watch?v=UQnbuAXjNtI&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=25)
## Code :

```java
import java.util.Scanner;

// https://www.youtube.com/watch?v=UQnbuAXjNtI&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=25
// Queue using Static Array of size n

class queue{
    int front = -1, rear = -1; //
    int n = 10; // Size of the static array
    int q[] = new int[n];

    void enQueue(){

        if(rear == (n-1)){ //*** Check the Overflow Condition
            System.out.println("Overflow Condition!");
        }
        // Nested if-else loop, Take care while revising
        else {

            System.out.println("Enter the data: ");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();

            if(front == -1 && rear == -1){
                front = 0;
                rear = 0;
                q[rear] = data;
            }
            else {
                rear++;
                q[rear] =data;
            }

        }

    }

    void deQueue(){

        if(front == -1 && rear == -1){
            System.out.println("Underflow Condition!");
        }
        else{
            front = front + 1;
        }

    }

    void display(){
        System.out.println("Items are: ");
        for(int i = front; i <= rear; ++i){
            System.out.println(q[i]);
        }

    }
}
public class queue_Array {
    public static void main(String[] args) {
        int choice, n;
        queue Q = new queue();

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

```