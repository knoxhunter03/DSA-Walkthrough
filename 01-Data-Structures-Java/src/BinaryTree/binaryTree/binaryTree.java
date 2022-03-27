import java.util.Scanner;

class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class binaryTree {

    static Node create(){
        int data;
        Node root = null;

        System.out.print(", Enter the data: ");
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();

        if(data == -1){
            return null;
        }

        root = new Node(data);

        System.out.print("Enter the left child of " + root.data);
        root.left = create();

        System.out.print("Enter the right child of " + root.data);
        root.right = create();

        return root;
    }

    public static void main(String[] args) {
        Node root = create();
    }
}
