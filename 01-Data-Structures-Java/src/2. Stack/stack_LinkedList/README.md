# Stack Using Linked List (Implementation)

### Stack Major Terms:
- **Underflow** : When _**top == null**_, Stack is empty!
- **Overflow** : **There is no case of Overflow in Linked List as we can insert 'n' number of nodes in Linked List dynamically.**
- **Push** : Insertion of element from Beginning - Singly Linked List
- **Pop** : Deletion of element from Beginning - Singly Linked List
- **Display or Show** : Traversal of elements

## [Video Reference 👆](https://www.youtube.com/watch?v=0H_wxGw0LUs&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=21)

## Code :

```java
import java.util.Scanner;

// https://www.youtube.com/watch?v=0H_wxGw0LUs&list=PLH9iLcrNpXtQYQiudzpZpGw0mptHc06Su&index=21
// Stack using Linked List
// Stack class contains similar static class & methods which we saw during Linked List
class Stack{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    Node top = null;

    void push(Scanner sc){
        // Insertion from Beginning will be followed!
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        Node new_node = new Node(data);

        if(top == null){ // No Overflow Condition in Stack using LL
                        // because its dynamic and we can insert 'n' number of nodes
            top = new_node;
        }
        else{
            // Same as Insertion from Beginning in Singly Linke List
            new_node.next = top;
            top = new_node;
        }
    }

    void pop(){
        // Deletion from beginning of Singly Linked List 
        if(top == null){
            System.out.println("Your stack is empty!");
            return;
        }
        else {
            // *** No need of Node temp = top ( recal... Singly Linked List - Deletion concept)
            top = top.next; // Why aren't we creating Node temp = top (Deletion from LL concept) here?
                            // Because top will only point to the next node will deletion
                            // Incase of LL we also need to store the address iin head, whereas here that's not required
        }
    }

    void display(){
        Node temp = top;
        if(top == null){
            System.out.println("Stack is empty!");
        }
        else{
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
public class stack_LinkedList {
    public static void main(String[] args) {
        int  choice, l;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        do{
            System.out.println("Press 1 to PUSH elements");
            System.out.println("Press 2 to POP elements");
            System.out.println("Press 3 to DISPLAY elements");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    s.push(sc);
                    break;

                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
            }

            System.out.println("Press 0 to go back to MAIN MENU");
            System.out.println("ENTER ANY NUMBER TO EXIT.");
            l = sc.nextInt();
        }while (l==0);
        System.out.println("EXIT SUCCESSFULLY");
    }
    }


```