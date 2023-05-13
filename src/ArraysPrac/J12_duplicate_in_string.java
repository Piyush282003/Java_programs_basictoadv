package ArraysPrac;
import java.util.*;
class Pair{
    char alphabet;
    int count;
    Pair(char ch, int x){
        this.alphabet = ch;
        this.count = x;
    }
    public String toString(){
        return "[('"+alphabet+"',"+count+")]";
    }
}
public interface J12_duplicate_in_string {
    public static ArrayList<Pair> duplicate_char(String s, int n) {

        ArrayList<Pair> a=new ArrayList<>();
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e:mp.entrySet()){
            // System.out.println(e.getKey());
            if(e.getValue()>1){
                a.add(new Pair(e.getKey(),e.getValue()));
            }
        }
        return a;

    }
    public static void main(String[] args) {
        ArrayList<Pair> a=duplicate_char("Apple",5);
        System.out.println(a);
        ArrayList<Pair> a1=duplicate_char("GEEK",4);
        System.out.println(a1);
    }
}
