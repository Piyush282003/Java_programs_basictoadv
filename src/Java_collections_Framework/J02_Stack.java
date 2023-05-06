package Java_collections_Framework;

import java.util.Stack;

public class J02_Stack {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("Piku");
        s.push("Aarchi");
        s.push("Geeta");
        s.push("Girish");

        System.out.println(s);


//        isme top ke elements ke liye peek() hota hai
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());




        for(String s1:s){
            System.out.print(s1+" ");
        }
    }
}
