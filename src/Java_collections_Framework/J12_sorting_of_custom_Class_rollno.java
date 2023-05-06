package Java_collections_Framework;

import java.util.*;

class Student1 implements Comparable<Student1>{
    String name;
    int rollno;

    public Student1(String name,int rollno){
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
    public int compareTo(Student1 that) {
        return this.rollno-that.rollno;
    }
}

public class J12_sorting_of_custom_Class_rollno {
    public static void main(String[] args) {
        List<Student1> l = new ArrayList<>();
        l.add(new Student1("Anuj1",2));
        l.add(new Student1("Anuj2",3));
        l.add(new Student1("Anuj3",4));
        l.add(new Student1("Anuj3",1));

        Student1 s1=new Student1("A",4);
        Student1 s2=new Student1("A",6);
        System.out.println(s1.compareTo(s2));

        Collections.sort(l);
        System.out.println(l);
    }
}
