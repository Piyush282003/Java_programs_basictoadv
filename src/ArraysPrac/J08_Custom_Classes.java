package ArraysPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    @Override
    public String toString(){
        return "Student{ name= '"+name+"' , rollNo= '"+rollno+"'}";
    }
}
public class J08_Custom_Classes {
    public static void main(String[] args) {
        List<Student> l =new ArrayList<>();
        l.add(new Student("Piyush1",101));
        l.add(new Student("Piyush2",105));
        l.add(new Student("Piyush3",100));

        System.out.println(l);

//        Collections.sort(l,new Comparator<Student>(){
//            @Override
//            public int compare(Student a,Student b){
////                return a.rollno-b.rollno;                          //->ascending order
//                return b.rollno-a.rollno;                              //->descending order
//            }
//        });
        Collections.sort(l,(a,b)->a.rollno-b.rollno);

        System.out.println(l);

    }
}
