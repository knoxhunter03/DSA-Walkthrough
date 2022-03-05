# Singly Linked List - Insertion

### 1.  from Beginning
### 2. from End
### 3. from Specific Location
## [Video Reference 👆](https://www.youtube.com/watch?v=WZFYgcalA0k&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=10&t=1303s) 

## Code :

```java

import java.util.Scanner;

public class singlyLinkedList_insert {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void create(){

        int data, c, n, p;

        do {
        System.out.println("Enter the data: ");
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();

        Node new_node = new Node(data);


            if (head == null) {
                head = new_node;
            } else {
                System.out.println("Press 1. Begin 2. End 3. At the given location");
                c = sc.nextInt();

                switch (c) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;

                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;

                    case 3:
                        Node temp1 = head;
                        System.out.println("Enter the position: ");
                        p = sc.nextInt();
                        for (int i = 0; i < (p - 2); i++) {
                            temp1 = temp1.next;
                        }

                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                }
            }

            System.out.println("Press 1 to add more elements");
            n = sc.nextInt();
        }
        while (n==1);
    }

    public void show(){
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
        singlyLinkedList_insert LL = new singlyLinkedList_insert();
        LL.create(); // while executing make sure to enter the pos twice because it's a
        // do while loop so it will execute once more!
        LL.show();
    }


}

```