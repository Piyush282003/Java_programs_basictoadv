package ArraysPrac;
import java.util.*;
public class J38_subseq {
    static void subseq(String s,List<String> l,String ans,int index){
        if(index>=s.length()){
            l.add(ans);
            return;
        }

        subseq(s,l,ans,index+1);

        char c=s.charAt(index);
        ans+=c;
        subseq(s,l,ans,index+1);
    }

    public static void main(String[] args) {
        String s="abcd";
        List<String> l=new ArrayList<>();
        String ans="";
        subseq(s,l,ans,0);
        System.out.println(l);


    }
}
