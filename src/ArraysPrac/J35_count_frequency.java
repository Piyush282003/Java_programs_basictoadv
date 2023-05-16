package ArraysPrac;

import java.util.*;
class Pairs{
    char first;
    int second;
    Pairs(char first,int second){
        this.first=first;
        this.second=second;
    }
    public String toString(){
        return "{first= "+first+" ,second= "+second+"}";
    }
}
public class J35_count_frequency {
    public static void main(String[] args) {
//        String s="cccaaa";
//        String s="Aabb";
        String s="tree";
        int arr[]=new int[256];
        String ans="";
        ArrayList<Pairs> a=new ArrayList<>();

        Arrays.fill(arr,0);
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                a.add((new Pairs((char)i,arr[i])));
            }
        }

        Collections.sort(a,(o1,o2)->{
            return o2.second-o1.second;
        });

        for(int i=0;i<a.size();i++){
            while(a.get(i).second!=0){
                ans+=a.get(i).first;
                a.get(i).second--;
            }
        }
        System.out.println(ans);
    }
}
