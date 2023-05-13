package ArraysPrac;

public class J26_move_zeroes_to_end {
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int s=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                swap(arr,s++,i);
            }
        }
    }
}
