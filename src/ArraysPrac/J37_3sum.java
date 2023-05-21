package ArraysPrac;

import java.util.*;


public class J37_3sum {
    public static void main(String[] args) {
        int []nums={-1,0,1,2,-1,-4};
        List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>> s=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    s.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        ans.addAll(s);                       //addAll bhi ek collection leta hai jo 2d hoti hai or vo collections of list extend krati hai ,ie agr set me upr uske generic me List na dete toh addAll nhi kr skte the..
        System.out.println(ans);
    }
}
