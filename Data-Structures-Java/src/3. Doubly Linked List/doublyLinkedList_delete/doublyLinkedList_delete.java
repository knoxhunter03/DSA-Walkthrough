import java.util.Scanner;

// https://youtu.be/gkDQNDh3q_0?list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su
public class doublyLinkedList_delete {
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
                tail.next = new_node;
                new_node.prev = tail;
                tail = new_node;
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

    public void delete(){
        int n, pos, p;
        Scanner sc = new Scanner(System.in);

        do{
            if(head == null){
                System.out.println("LL is empty!");
            }
            else {
                System.out.println("To DELETE press 1 for beg, 2 for end, 3 for at a position");
                pos = sc.nextInt();

                switch (pos){
                    case 1: // Delete elements from first
                        Node temp = head;
                        temp = temp.next; // Move the temp pointer to the next node
                        head = temp; // Conenct the next node with head
                        head.prev = null; // It's very very important to make prev section of second node as NULL
                                        // ** head. prev is same as temp.prev
                        break;

                    case 2: // Delete elements from end
                        Node temp2 = tail; // Intialize temp with tail to BACKTRACK the Doubly Linked List
                        temp2 = temp2.prev; // Move temp node in backward direction
                        temp2.next = null; // Make the next part of temp as null to disconnect the tail link with last node
                        tail = temp2;
                        break;

                    case 3: // Delete elements from any given location
                        // ***
                        Node temp3 = head;
                        Node ptr = temp3.next;

                        System.out.println("Enter the given location: ");
                        p = sc.nextInt();

                        for(int i = 1; i < p-1; i++){
                            temp3 = ptr;
                            ptr = ptr.next;
                        }

                        temp3.next = ptr.next;
                        ptr.next.prev = temp3; // *** ptr.next is nothing but the next node
                                               // So next node.prev will be linked to our temp node

                        //* Example
                        // head --->/                                  /----> tail
                        //  x----10---> <---20----> <----30----> <---40--->
                        // DELETE : 30 (say)
                        // so temp will pont 20 and ptr will point 30
                        // +** ptr.next is nothing but the next node i.e. 40
                        // Now ptr.next.prev means the prev part of 40
                        // Go and read the code part now! Hope you understand :)
                        // *//


                }
            }

            System.out.println("Do you want to delete more data? If Yes, then Press 1");
            n = sc.nextInt();

        } while(n==1);
    }

    public static void main(String[] args) {
        doublyLinkedList_delete LL = new doublyLinkedList_delete();
        LL.create();
        LL.delete();
        LL.show();
    }
}
