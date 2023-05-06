package Java_collections_Framework;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class J06_HashSet {
    public static void main(String[] args) {
//        hashset me TC=O(1) me hote hai
        Set<Integer> s=new HashSet<>();
        s.add(1);
        s.add(5);
        s.add(2);
        s.add(3);
        System.out.println(s);
        s.remove(5);
        System.out.println(s);
        System.out.println(s.contains(5));
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.clear();
        System.out.println(s);


        Set<Integer> s2=new LinkedHashSet<>();
        s2.add(8);
        s2.add(6);
        s2.add(8);
        s2.add(4);
        System.out.println(s2);

//        hashset me TC=O(log n) me hote hai
        Set<Integer> s3=new TreeSet<>();
        s3.add(4);
        s3.add(478);
        s3.add(47856);
        s3.add(478561);
        System.out.println(s3);
    }
}
