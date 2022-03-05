# Singly Linked List - Implementation
## [Video Reference 👆](https://www.youtube.com/watch?v=WZFYgcalA0k&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=10&t=1303s) 

## Code :

```java
import java.util.Scanner;

public class singlyLinkedList {

    static class Node{
        int data;
        Node next; // Why Node here? because it will point to Node *data type

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null; // Creating a starting or basic node

    public void create(){

        int data, n;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the data :");
            data = sc.nextInt();

            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }

            System.out.println("Do you want to add more data? If Yes, then Press 1");
            n = sc.nextInt();
        }
        while(n==1);

    }

    public void traverse(){
        if (head == null){
            System.out.println("Your linked list is empty!");
        }

        else {
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        singlyLinkedList LL = new singlyLinkedList();
        LL.create();
        LL.traverse();
    }

}

```