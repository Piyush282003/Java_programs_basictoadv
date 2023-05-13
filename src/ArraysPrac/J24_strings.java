package ArraysPrac;

public class J24_strings {
    public static void main(String[] args) {
//        use string buffer insetead of strings...
        StringBuffer s =new StringBuffer("");
        s.append("45");                                    //pushback
        s.insert(0,"gf");
        s.deleteCharAt(s.length()-1);                        //popback
        System.out.println(s);

//        strings pdhni hai hume
    }
}
