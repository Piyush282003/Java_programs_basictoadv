package Java_collections_Framework;

import java.util.*;

class Student3 implements Comparable<Student3>{
    String name;
    int rollno;

    public Student3(String name,int rollno){
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

    @Override
    public int compareTo(Student3 that) {
        return this.name.compareTo(that.name);
    }
}
public class J13_sorting_of_custom_Class_name {
    public static void main(String[] args) {
        List<Student3> l = new ArrayList<>();
        l.add(new Student3("Anuj4",2));
        l.add(new Student3("Anuj2",3));
        l.add(new Student3("Anuj3",4));
        l.add(new Student3("Anuj3",1));

        Student1 s1=new Student1("A",4);
        Student1 s2=new Student1("A",6);
        System.out.println(s1.compareTo(s2));

        Collections.sort(l);
        System.out.println(l);
    }
}
