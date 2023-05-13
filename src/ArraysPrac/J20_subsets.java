package ArraysPrac;
import java.util.*;
public class J20_subsets {
    public static void solve(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> output,int index,ArrayList<Integer> a) {
        if (index == a.size()) {
            ans.add(output);
            return;
        }

        solve(ans, new ArrayList<>(output), index + 1, a);

        int ele = a.get(index);
        output.add(ele);
        solve(ans, new ArrayList<>(output), index + 1, a);

        /*In Java, all primitives like int, char, etc are similar to C/C++, but all non-primitives (or objects of any class)
        are always references. So it gets tricky when we pass object references to methods. Java creates a copy of references
        and pass it to method, but they still point to same memory reference. Mean if set some other reference to object passed
        inside method, the object from calling method as well its reference will remain unaffected. The changes are not reflected
        back if we change the object itself to refer some other location or object If we assign reference to some other location, then
        changes are not reflected back in main().


        */
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer> > subset = new ArrayList<>();

        // Input ArrayList
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        ArrayList<Integer> output = new ArrayList<>();
        solve(subset,output,0,input);

        Collections.sort(subset, (o1, o2) -> {
            int n = Math.min(o1.size(), o2.size());
            for (int i = 0; i < n; i++) {
                if (o1.get(i) == o2.get(i)) {
                    continue;
                }
                else {
                    // sort based on the unequal elements value
                    return o1.get(i) - o2.get(i);
                }
            }

//             sort based on size
            return o1.size() - o2.size();
        });

        for (int i = 0; i < subset.size(); i++) {
            for (int j = 0; j < subset.get(i).size(); j++) {
                System.out.print(subset.get(i).get(j) + " ");
            }
            System.out.println();
        }

//        Time Complexity: O(2^n). Total number of subsets generated are 2^n, So Time Complexity is O(2^n). If we include
//        the time taken to copy the subset vector into the res vector the time taken will be equal to the size of the subset vector.
//                Auxiliary Space: O(n) There can be at max n recursion calls at a particular time, which would consume O(n) stack space.
    }
}
