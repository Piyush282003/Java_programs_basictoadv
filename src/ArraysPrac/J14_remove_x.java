package ArraysPrac;

public class J14_remove_x {
    public static String replace(String s){
        if(s.length()==0){
            return "";
        }

        if(s.charAt(0)=='x'){
            return replace(s.substring(1));
        }

        return s.charAt(0)+replace(s.substring(1));
    }
    public static void main(String[] args) {
        String s="pxpxadxxxd";
        System.out.println(replace(s));
    }
}
