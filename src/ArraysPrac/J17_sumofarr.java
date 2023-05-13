package ArraysPrac;

public class J17_sumofarr {
    public static int sum(int [] arr,int i,int cnt){
        if(i==arr.length){
            return cnt;
        }
        cnt=cnt+arr[i];

        return sum(arr,i+1,cnt);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(sum(arr,0,0));
    }
}
