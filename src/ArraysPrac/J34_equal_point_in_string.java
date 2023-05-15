package ArraysPrac;

public class J34_equal_point_in_string {
    public static long countSub(String arr) {
        // Your code goes here
        int i=0,j=arr.length()-1;
        while(i<=j){
            if(arr.charAt(i)!='('){
                i++;
            }
            else if(arr.charAt(j)!=')'){
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        System.out.println(countSub("(())))("));
    }
}
