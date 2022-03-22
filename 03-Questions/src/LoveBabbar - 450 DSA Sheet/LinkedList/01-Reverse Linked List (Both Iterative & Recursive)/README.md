# Reverse A Linked List (Iterativley & Recursively)
## [Video Reference 👆](https://www.youtube.com/watch?v=ugQ2DVJJroc)

## Code :

```java
public class reverseLinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;

    public void add(int data){
        Node new_node = new Node(data);

        if(head ==  null){
            head = new_node;
        }
        else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
        }

    }

    // Iterative Approach
    Node reverse(Node head){
        Node cur = head;
        Node prev = null;

        while (cur != null){
            Node temp = cur.next; // Store the value of next node in temp
            cur.next = prev; // Back link current to it's previous node
            prev = cur; // Increase the prev node or make previous node as current
            cur = temp; // Increase the current node as temp or the next pointing node
        }

        return prev;
    }

    Node revRese(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = revRese(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;

        return newHead;
    }

    public static void print(Node temp){
        if(temp == null){
            System.out.println("list is empty!");
        }
        else{
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }


    public static void main(String[] args) {
        reverseLinkedList L = new reverseLinkedList();
        L.add(10);
        L.add(20);
        L.add(30);
        L.add(40);
        L.add(50);

        L.print(head);

        Node new_head = L.reverse(head);

        System.out.println("\nReverse Linked List is :");
        System.out.println("-----Iteratively----");
        L.print(new_head);

        System.out.println("\nReverse Linked List is :");
        System.out.println("-----Recursively----");
        Node oldHead = L.revRese(new_head);
        L.print(oldHead);

    }

}

```