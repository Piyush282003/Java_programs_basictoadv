package Java_collections_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class J11_Collections_class {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(4);
        l.add(4);
        l.add(4);
        l.add(1);
        l.add(-45);
        l.add(55);

        System.out.println("Min ele is "+ Collections.min(l));
        System.out.println("Min ele is "+ Collections.max(l));
        System.out.println("Frequency of ele 4 is "+Collections.frequency(l,4));

        Collections.sort(l);
        System.out.println(l);

        Collections.sort(l, Comparator.reverseOrder());
        System.out.println(l);
    }
}
