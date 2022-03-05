# Singly Linked List - Deletion

### 1.  from Beginning
### 2. from End
### 3. from Specific Location
## [Video Reference 👆](https://www.youtube.com/watch?v=ldVRWeoF1fc&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=11&t=1083s) 

## Code :

```java
import java.util.Scanner;

public class singlyLinkedList_delete {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null; // Starting or basic node

    public void create(){

        int data, n;

        do {
            System.out.println("Enter the data: ");
            Scanner sc = new Scanner(System.in);
            data = sc.nextInt();

            Node new_node = new Node(data);


            if (head == null) {
                head = new_node;
            } else { // Insert elements at the end
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new_node;
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
            while(temp.next != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void delete(){
        int n, pos, p;
        Scanner sc = new Scanner(System.in);

        do{
            if(head == null){
                System.out.println("LL is empty!");
            }
            else {
                System.out.println("1 for beg, 2 for end, 3 for at a position");
                pos = sc.nextInt();

                switch (pos){
                    case 1: // Delete elements from first
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        break;

                    case 2: // Delete elements from end
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        while (ptr.next != null){
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = null;
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
            }

            System.out.println("Do you want to delete more data? If Yes, then Press 1");
            n = sc.nextInt();
        } while(n==1);
    }

    public static void main(String[] args) {
        singlyLinkedList_delete LL = new singlyLinkedList_delete();
        LL.create();
        LL.delete();
        LL.show();

    }


}

```