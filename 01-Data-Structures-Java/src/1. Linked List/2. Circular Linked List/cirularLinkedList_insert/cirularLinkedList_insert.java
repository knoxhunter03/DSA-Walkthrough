// https://www.youtube.com/watch?v=BOEKC-S5ZQM&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=13
import java.util.Scanner;

public class cirularLinkedList_insert {
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
        int data, m, n, p;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the data:");
            data = sc.nextInt();

            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
                tail = new_node;
                new_node.next = head;
            }
            else {
                System.out.println("To insert press 1 - Begin; 2 - End; 3 - At Location");
                m = sc.nextInt();

                switch (m){
                    case 1:
                        new_node.next = head; // Same as singly LL
                        head = new_node; // But..
                        tail.next = new_node; // Connect the last element to form a circular LL
                        break;
                    case 2:
                        tail.next = new_node; // Easy to access the last node from tail
                        tail = new_node; // Again store new node address in tail
                        new_node.next = head; // Connect the newly added node to head and form circular LL
                        break;
                    case 3:
                        // Same as insertion at specific position in singly LL
                        // No changes in ** tail
                        System.out.println("Enter the position:");
                        p = sc.nextInt();
                        Node temp = head;
                        for(int i = 0; i < (p-2) ; i++){
                            temp = temp.next;
                        }
                        new_node.next = temp.next;
                        temp.next = new_node;
                        break;
                }
            }
            System.out.println("Do you want to add more data? If Yes, then Press 1");
            n = sc.nextInt();
        }while (n==1);
    }

    public void traverse(){
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
        cirularLinkedList_insert LL = new cirularLinkedList_insert();
        LL.create(); // while executing make sure to enter the pos twice because it's a
        // do while loop so it will execute once more!
        LL.traverse();
    }
}
