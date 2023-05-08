package ArraysPrac;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class J05_StringJoiner {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("Ram");
        l.add("Shyam");
        l.add("Bob");
        l.add("Dog");

        StringJoiner s = new StringJoiner(",");
        s.setEmptyValue("This is empty");
        System.out.println(s);

        s.add(l.get(0)).add(l.get(2));
        System.out.println(s);
        System.out.println(s.length());

        StringJoiner s1=new StringJoiner(":");
        s1.add(l.get(1)).add(l.get(3));
        System.out.println(s1);

        s.merge(s1);
        System.out.println(s);
        System.out.println(s.length());


        System.out.println(s.toString());
    }
}
