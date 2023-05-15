package ArraysPrac;

public class J29_roman_to_integer {
        public static int getp(char s){
            if(s=='I'){
                return 1;
            }
            else if(s=='V'){
                return 5;
            }
            else if(s=='X'){
                return 10;
            }
            else if(s=='L'){
                return 50;
            }
            else if(s=='C'){
                return 100;
            }
            else if(s=='D'){
                return 500;
            }
            else if(s=='M'){
                return 1000;
            }
            return 0;
        }
        public static void main(String[] args) {
//        String s="V";
//        String s="MMMDCCXCIV";
//        String s="VIII";
            String s="CMXVI";
            int ans=getp(s.charAt(0));
            for(int i=1;i<s.length();i++){
                int n=getp(s.charAt(i));
                int k=getp(s.charAt(i-1));
                if(n>k){
                    ans+=n-k-k;
                }
                else{
                    ans+=n;
                }
//            System.out.println(ans);
            }
            System.out.println(ans);
        }

}
