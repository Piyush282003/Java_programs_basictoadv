package ArraysPrac;

import java.util.Arrays;

public class J09_Array_equals_deepequals {
    public static void main(String[] args) {
//        Arrays.equals(arr1,arr2);                          -->not applicable for 2-D arrays so we use Arrays.deepEquals(arr1,arr2); here...
        int[][] arr1 = { { 0, 1 }, { 1, 0 } };
        int[][] arr2 = { { 0, 1 }, { 1, 0 } };

        System.out.println("is arr1 equals to arr2 : "
                + Arrays.equals(arr1, arr2));
        System.out.println("is arr1 deepequals to arr2 : "
                + Arrays.deepEquals(arr1, arr2));
    }
}
