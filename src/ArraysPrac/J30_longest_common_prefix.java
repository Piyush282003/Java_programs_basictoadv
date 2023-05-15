//package ArraysPrac;
//
//public class J30_longest_common_prefix {
//    public static String get(String a,String b,String c){
//        if(a.length()==0 || b.length()==0){
//            return c;
//        }
//        if(a.charAt(0)==b.charAt(0)){
//            c+=a.charAt(0);
//            return get(a.substring(1),b.substring(1),c);
//        }
//        return get(a.substring(1),b,c);
//    }
//    public static void main(String[] args) {
//        String arr[]={"geeksforgeeks", "geeks", "geek","geezer"};
//        String c=get(arr[0],arr[1],"");
////        System.out.println(c);
//        for(int i=2;i<arr.length;i++){
//            c=get(c,arr[i],"");
//        }
//        System.out.println(c);
//    }
//}
