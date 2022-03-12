# Circular Linked List - Implementation
## [Video Reference 👆](https://www.youtube.com/watch?v=eSXljM_sAPI&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=12&t=1187s) 

## Code :

```java
import java.util.Scanner;

public class circularLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null; // Starting node pointer
    Node tail = null; // Ending node pointer

    public void create(){
        int data, n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the data:");
            data = sc.nextInt();

            Node new_node = new Node(data);

            if(head == null){
                head = new_node; // Same as Singly LL but
                tail = new_node; // Update tail also at the same time
                new_node.next = head; // Connect last node to head to create a circle
            }

            else {
                new_node.next = head;
                head = new_node; // Same as Singly LL but
                tail.next = head; // To access last node we use tail and then
                                  // connect the last node with head
            }

            System.out.println("Do you want to add more data? If Yes, then Press 1");
            n = sc.nextInt();

        }while (n==1);
    }

    public void show(){
      Node temp = head;
      if(head == null){
          System.out.println("Your LL is empty!");
      }
      else{
          do{
              System.out.println(temp.data + " ");
              temp = temp.next;
          }while (temp != head);
      }
    }

    public static void main(String[] args) {
        circularLinkedList LL = new circularLinkedList();
        LL.create();
        LL.show();
    }
}


```