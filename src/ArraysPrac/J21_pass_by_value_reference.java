package ArraysPrac;

//public class J21_pass_by_value_reference {
//    public static void main(String[] args)
//    {
//        int x = 5;
//        change(x);
//        System.out.println(x);
//    }
//    public static void change(int x) { x = 10; }
//}
class Test {
    int x;
    Test(int i) { x = i; }
    Test() { x = 0; }
}

class Main {
    public static void main(String[] args)
    {
        // t is a reference
        Test t = new Test(5);

        // Reference is passed and a copy of reference
        // is created in change()
        change(t);

        // Old value of t.x is printed
        System.out.println(t.x);
    }
    public static void change(Test t)
    {
        // We changed reference to refer some other location
        // now any changes made to reference are not
        // reflected back in main
        t = new Test();

        t.x = 10;
    }
}
//class Main2{
//    public static void main(String[] args)
//    {
//        // t is a reference
//        Test t = new Test(5);
//
//        // Reference is passed and a copy of reference
//        // is created in change()
//        change2(t);
//
//        // New value of x is printed
//        System.out.println(t.x);
//    }
//
//    // This change() doesn't change the reference, it only
//    // changes member of object referred by reference
//    public static void change2(Test t) { t.x = 10; }
//}
