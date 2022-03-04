# Circular Linked List - Deletion
## 1. from Beginning
## 2. from End
#3 3. at Specific Location
## [Video Reference 👆](https://www.youtube.com/watch?v=aaULI7OIeD8&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=14) 

## Code :

```java
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

// https://www.youtube.com/watch?v=aaULI7OIeD8&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=14
public class circularLinkedList_delete {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void create(){
        int data, m, n;
        do{
            System.out.println("Enter the data: ");
            Scanner sc = new Scanner(System.in);
            data = sc.nextInt();

            Node new_node = new Node(data);

            if(head == null){
                head = new_node;
                tail = new_node;
                new_node.next = head;
            }
            else{ // Insert from end
                tail.next = new_node;
                tail = new_node;
                new_node.next = head;
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
                System.out.println(temp.data);
                temp = temp.next;
            }while (temp.next != head);
        }

    }

    public void delete(){
        int data, n, choice, p;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("To delete press 1 - Begin; 2 - End; 3 - At Location");
        choice = sc.nextInt();

        switch (choice){
            case 1: // delete from beg
            Node temp = head;

            temp = temp.next;
            head = temp;
            tail.next = head;
            break;

            case 2: // delete from end
            Node temp1 = head; // We always take a temp while deletimg
            Node ptr = temp1.next; // Take another pointer to track address of next Node
                                    // Once we reach end Node it helps to loacte back to temp
            while (ptr.next != head){  // Replace null with head
                temp1 = ptr;
                ptr = ptr.next;
            }
            temp1.next = head;
            tail = temp1;
            break;

            case 3: // Delete elements from any given location
                System.out.println("Enter the position: ");
                p = sc.nextInt();
                Node temp2 = head;
                Node ptr2 = head;
                for(int i = 0; i < p-1; i++){
                    temp2 = ptr2;
                    ptr2 = ptr2.next;
                }
                temp2.next = ptr2.next;

        }
            System.out.println("Do you want to delete more data? If Yes, then Press 1");
            n = sc.nextInt();
        }while (n == 1 );
    }

    public static void main(String[] args) {
        circularLinkedList_delete LL = new circularLinkedList_delete();
        LL.create();
        LL.delete();
        LL.show();
    }
}


```
