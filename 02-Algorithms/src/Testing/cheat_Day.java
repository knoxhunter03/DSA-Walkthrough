// Java Program to sort using Collection Framework Methods
// *** Collections.sort();

import java.util.ArrayList;
import java.util.Collections;

public class cheat_Day {
    public static void main(String[] args) {
        ArrayList<Integer> d = new ArrayList<>();
        d.add(90);
        d.add(2);
        d.add(333);
        d.add(89);
        d.add(69);

        Collections.sort(d);
        System.out.println(d);

        ArrayList<String> x = new ArrayList<>();
        x.add("Money");
        x.add("Zolo");
        x.add("CocaCola");
        x.add("Camera");
        x.add("Add");

        Collections.sort(x);
        System.out.println(x);

    }
}