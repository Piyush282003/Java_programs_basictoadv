package Java_collections_Framework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
    String name;
    int rollno;

    public Student(String name,int rollno){
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
public class J07_set_of_custom_class {
    public static void main(String[] args) {
        Set<Student> st = new HashSet<>();
        st.add(new Student("Anuj1",2));
        st.add(new Student("Anuj2",3));
        st.add(new Student("Anuj3",4));
        st.add(new Student("Anuj3",4));
        st.add(new Student("Anu",4));

        System.out.println(st);                          //class me toStirng wala method isliye dala coz sout me vo toString wala hi implement hota hai..

//        Anuj3 wala do baar hai but yeh set usko ek alag-alag object maanega or store krega apne andr...toh uske liye hum hashcode and equals method implement krnege..
//        ab agr rollno same hai toh fr bhi vo add nhi honge..



        Student s1=new Student("Anuj1",8);
        Student s2=new Student("Anuj2",8);
        System.out.println(s1.equals(s2));                             //->true coz humne equals me daal rkha hai ki agr rollno equal honge toh bhi true dena hai
    }
}
