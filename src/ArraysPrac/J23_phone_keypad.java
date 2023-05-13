package ArraysPrac;

import java.util.ArrayList;

public class J23_phone_keypad {
    static void solve(int a[], ArrayList<String> ans, StringBuffer output, int index, String mapping[], int n){
        if(index==n){
            ans.add(output.toString());
            return;
        }

        String val = mapping[a[index]];

        for(int i=0;i<val.length();i++){
            output.append(val.charAt(i));
            solve(a,ans,output,index+1,mapping,n);
            output.deleteCharAt(output.length()-1);
        }
    }
    static ArrayList <String> possibleWords(int a[], int n)
    {
        // your code here
        StringBuffer output=new StringBuffer("");
        int index=0;
        ArrayList<String> ans=new ArrayList<String>();
        String mapping[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(a,ans,output,index,mapping,n);
        return ans;
    }

    public static void main(String[] args) {
        int a[]={2,5};
        System.out.println(possibleWords(a,2));
    }
}
