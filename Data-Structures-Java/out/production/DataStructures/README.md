# Queue using Linked List (Implementation)
### Queue Major Terms:
- **Underflow** : When _**front == null && rear == null**_, Queue is empty!
- **Overflow** : Basically **no Overflow condition**, as we can insert elements in Linked List dynamically.
- **Enqueue** : Inserting an elemnet in Queue **(i.e Insertion from End)**
- **Dequeue** : Deleting an element from Queue **(i.e. Deletion from Beginning)**
- **Display or Show** : Traversal of elements
## [Video Reference 👆](https://www.youtube.com/watch?v=Ey_CeVcZi4c&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=26)

## Code :

```java
import java.util.Scanner;

// https://www.youtube.com/watch?v=Ey_CeVcZi4c&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=26
class queue1{
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node front = null;
    Node rear = null;

    void enQueue(){
        int data;
        System.out.println("Enter the data: ");
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();

        Node new_node = new Node(data);

        // Insert elements in Linked List at the end!
        if(front == null){
            front = new_node;
            rear = new_node;
        }
        else {
            rear.next = new_node;
            rear = new_node;
        }
        System.out.println("Item added!");

    }

    void deQueue(){
        if(front == null){
            System.out.println("Underflow Condition!");
        }
        else {
            front = front.next;
            System.out.println("Item deleted!");
        }
    }

    void display(){
        Node temp = front;

        if(front == null){
            System.out.println("Queue is empty!");
        }
        else {
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
public class queue_LinkedList2 {
    public static void main(String[] args) {
        int choice, n;
        queue1 Q = new queue1();

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