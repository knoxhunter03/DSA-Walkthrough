# Doubly Linked List - Implementation
## [Video Reference 👆](https://www.youtube.com/watch?v=9sEg3qtW8zA&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=15)

## Code :

```java
import java.util.Scanner;

// https://www.youtube.com/watch?v=9sEg3qtW8zA&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=15
public class doublyLinkedList {
    static class Node{
        int data;
        Node next;
        Node prev; // In doubly linked list we add a prev node which helps in backtracking

        Node(int data){
            this.data = data;
            this.prev = null; // Similarly like every other LL intialize prev with null
            this.next = null;
        }
    }

    Node head = null; // Basic or starting node
    Node tail = null; // Basic or ending node

    public void create(){
        int data, m, n, p;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the data: ");
            data = sc.nextInt();

            Node new_node = new Node(data);

            if(head == null){
                head = new_node; // Same as Singly LL
                tail = new_node;
            }
            else{
                // ** Insert elements from beginning!
                head.prev = new_node; // It's bit confusing so Draw Diagram if not understood
                new_node.next = head; // Link new node next part to first node with the help of head
                                      // As head has address of first node!
                head = new_node;      // Now assign address of new node to head
            }

            System.out.println("Do you want to add more data? If Yes, then Press 1");
            n = sc.nextInt();

        }while (n == 1);

    }

    public void show(){
        // Traversing is same as singly LL without any modifications
        Node temp = head;

        if(head == null){
            System.out.println("Your Doubly LL is empty!");
        }
        else{
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        doublyLinkedList LL = new doublyLinkedList();
        LL.create();
        LL.show();
    }
}


```