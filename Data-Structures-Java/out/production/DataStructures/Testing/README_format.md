# Doubly Linked List - Insertion
## 1. from Beginning
## 2. from End
## 3. at Specific Location
## [Video Reference 👆](https://www.youtube.com/watch?v=6TOLiyEC8vA&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=16)

## Code :

```java
import java.util.Scanner;

// https://www.youtube.com/watch?v=6TOLiyEC8vA&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=16
public class doublyLinkedList_insert {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void create(){
        int data, m, n, p;
        do{
            System.out.println("Enter the data: ");
            Scanner sc = new Scanner(System.in);
            data = sc.nextInt();

            Node new_node = new Node(data);

            if(head == null){
                head = new_node;
                tail = new_node;
            }
            else {
                System.out.println("To INSERT press 1 - BEG, 2 - END, 3 - AT SPECIFIC LOCATION");
                m = sc.nextInt();
                
                // While inserting data most important part is Sequence

                switch (m){

                    case 1:
                        head.prev = new_node; // Same as implemented in doublyLinkedList.java file
                        new_node.next = head;
                        head = new_node;
                        break;

                    case 2:
                        tail.next = new_node; // Connect last node next part to new node
                        new_node.prev = tail; // Now link new node prev part with the ex last node
                        tail = new_node; // Finally store address of  new node in tail
                        break;

                    case 3:
                        System.out.println("Enter the position: ");
                        p = sc.nextInt();

                        Node temp = head;
                        Node ptr = temp.next; // Create a new pointer which will point next to temp
                                              // It makes easy to insert with this extra node

                        for(int i = 1; i < p-1; i++){
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        
                        // *** Sequence is most important here!
                        new_node.prev = temp; // Link prev of new node to temp 
                                              // <----NEW NODE---x
                        new_node.next = ptr;  // Link prev of new node to temp
                                              // <----NEW NODE--->
                        temp.next = new_node; // Finally link new node in between!
                        ptr.prev = new_node;
                        break;
                }
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
        else {
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        doublyLinkedList_insert LL = new doublyLinkedList_insert();
        LL.create();
        LL.show();
    }
}

```