package Java_collections_Framework;

import java.util.*;

class Student4 {
    String name;
    int rollno;

    public Student4(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }

    @Override
    public String toString(){
        return "Student{"+
                "name='"+name+'\''+", rollNo="+rollno+'}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }


}
public class J14_Comparator_Interface {
    public static void main(String[] args) {
        List<Student4> l = new ArrayList<>();
        l.add(new Student4("Anuj4",2));
        l.add(new Student4("Anuj2",3));
        l.add(new Student4("Anuj3",4));
        l.add(new Student4("Anuj3",1));

        Student1 s1=new Student1("A",4);
        Student1 s2=new Student1("A",6);
        System.out.println(s1.compareTo(s2));

        Collections.sort(l, new Comparator<Student4>() {
            @Override
            public int compare(Student4 o1, Student4 o2) {
                return o1.rollno-o2.rollno;
            }
        });
        System.out.println(l);

        Collections.sort(l, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println(l);
    }
}
