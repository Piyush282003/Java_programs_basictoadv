package ArraysPrac;

public class J28_reverse_String_words {
    public static void main(String[] args) {
        String s="i.like.this pr ogr am.very.much";
        String []c = s.split("[ ]");                 //"[]" me likhna hai toh yaad rkho.. split me hum chahe space se split krana ho toh bhi yhi use krenge [ ]..
        String b="";
//        for(int i=0;i<c.length;i++){
//            System.out.println(c[i]);
//        }
        for(int i=c.length-1;i>=0;i--){
            b+=c[i];
            if(i!=0){
                b+=".";
            }
        }
        System.out.println(b);
    }
}
