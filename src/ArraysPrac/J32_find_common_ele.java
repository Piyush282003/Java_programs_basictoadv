package ArraysPrac;

import java.util.HashMap;
import java.util.HashSet;

public interface J32_find_common_ele {
    public static void main(String[] args) {
        int a1[]={4,3,7,9,2};
        int a2[]={5,1,4,8,3};

        HashSet<Integer> h = new HashSet<>();
        for(int i:a1){
            h.add(i);
        }
        for(int i:a2){
            boolean b=h.add(i);                 //agr add hoje toh theek vrna yeh false return krega...
            if(b==false){
                System.out.println(i);
            }
        }
    }
}
