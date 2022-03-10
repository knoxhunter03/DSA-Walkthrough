import java.util.LinkedList;
import java.util.Queue;

public class queue_LinkedList2 {
    public static void main(String[] args) {
        Queue<Integer> c = new LinkedList<>();

        c.offer(10); // offer() - adds an element in the Queue
        c.offer(20);
        c.offer(30);
        c.offer(40); // [10, 20, 30, 40]

        System.out.println("Queue elements are: ");
        System.out.println(c);

        System.out.println("The front element is: " + c.peek());
        // peek() - returns the front element of the Queue

        c.poll(); // pop() - removes the element from front in Queue
        c.poll();
        System.out.println("Queue elements after deleting :");
        System.out.println(c);
    }
}
