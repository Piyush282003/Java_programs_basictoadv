package ArraysPrac;

public class J06_Duplicate_num {
    public static void main(String[] args) {
//        int [] arr={0, 4, 3, 3, 7, 8, 2, 3, 1 };
        int [] arr={0, 4, 3, 2, 3, 4, 7, 8, 2, 3, 1 };
//        int [] arr={2,2,2,2,2};


//        yeh concept yaad rkhlo...
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[arr[i]%n]+=n;
//            arr[arr[i]%n]=arr[arr[i]%n]+n;
        }

//        System.out.println("Now the array is:-");
//        for(Integer i:arr){
//            System.out.println(i);
//        }
        for(int i=0;i<n;i++){
            if(arr[i]>=n*2){
                System.out.println("The duplicate element is "+i);
            }
        }
    }
}

//// Map<Integer,Integer> mp=new HashMap<>();
//    // for(int i=0;i<nums.length;i++){
//    //     int c=nums[i];
//    //     mp.put(c,mp.getOrDefault(c,0)+1);
//    // }
//    // int i=0,ans=0;;
//    // for(Map.Entry<Integer,Integer> e:mp.entrySet()){
//    //     if(i<e.getValue()){
//    //         ans=e.getKey();
//    //         i=e.getValue();
//    //     }
//    //     // System.out.println(ans);
//    // }
//    // return ans;
//
//    int n=arr.length;
//        for(int i=0;i<n;i++){
//        arr[arr[i]%n]+=n;
////            arr[arr[i]%n]=arr[arr[i]%n]+n;
//        }
//
////        System.out.println("Now the array is:-");
////        for(Integer i:arr){
////            System.out.println(i);
////        }
//        for(int i=0;i<n;i++){
//        if(arr[i]>=n*2){
//        return i;
//        }
//        }
//        return -1;
