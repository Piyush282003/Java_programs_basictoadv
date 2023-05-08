package JavaDoc;


/**
 * This is to demonstrate what JavaDoc is and how it is used in the java industry..
 * This is <I>italic</I> word..<p>This is a new paragraph</p>
 * @author Piyush {Chitkara University}
 * @version 0.1
 * @since 2023
 * @see <a href="https://javadoc.scijava.org/Java14/jdk.javadoc/module-summary.html" target="_blank">Java Docs</a>
 */




public class J01_javaDoc {
    public void add(int a,int b){
        System.out.println("The sum is "+ a+b);
    }
    public static void main(String[] args) {
        System.out.println("This is my main method");
    }
}
