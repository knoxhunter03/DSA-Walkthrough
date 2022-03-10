import java.util.Stack;

public class stack_CollectionFramework {

    public static void main(String[] args) {
        Stack<Integer> c = new Stack<>(); // Syntax of Stack using Collection Framework

        c.push(10); // push() - adds element into stack
        c.push(20);
        c.push(30);

        System.out.println(c); // It will printed like [10,20,30]

        c.pop(); // pop() - deletes or removes the top item from stack
        System.out.println("After popping elements from stack");
        System.out.println(c);

        c.push(80);
        c.push(99);

        int d = c.peek(); // peek() - returns the top element from stack
        System.out.println("After insertion, the top element becomes");
        System.out.println(d);

        System.out.println("The index of the element 20 is");
        int x = c.search(99); // search() - basically is used to check whether an element is
                                    // present or not! It returns the index or location from top;
        System.out.println(x);

    }
}
