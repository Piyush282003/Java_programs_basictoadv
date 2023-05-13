package ArraysPrac;

public class J15_pair_star {
    public static String pair(String s){
        if(s.length()==1){
            return s;
        }
        if(s.charAt(0)==s.charAt(1)){
            return s.charAt(0)+"*"+pair(s.substring(1));
        }
        return s.charAt(0)+pair(s.substring(1));
    }
    public static void main(String[] args) {
//        String s="Geek";
        String s="Geekssllgh";
        System.out.println(pair(s));
    }
}
