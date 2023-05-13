package ArraysPrac;

public class J13_replace_pi {
    public static void main(String[] args) {
        String s="pippppppipipppiiiii";
//        for(int i=0;i<s.length()-1;i++){
//            if(s.charAt(i)==p)
//        }
        String s1=s.replaceAll("pi","3.14");
        System.out.println(s.replaceAll("pi","3.14"));
        System.out.println(s1);


    }
}
