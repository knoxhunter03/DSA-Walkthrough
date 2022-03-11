import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet {
        public static void main(String[] args) {

            Set<Integer> value = new LinkedHashSet<>(); // Syntax of LinkedHashSet

            value.add(10);
            value.add(20);
            value.add(30);
            value.add(99);
            value.add(69);

            System.out.println("Added Elements: ");
            System.out.println(value);

            value.remove(20);
            System.out.println("Elements after removing 20");
            System.out.println(value);

            value.add(40);
            value.add(50);

            boolean flag = value.contains(40);
            System.out.println(flag);

            value.clear();
            System.out.println("All the elements are cleared now");
            System.out.println(value);
        }
}
