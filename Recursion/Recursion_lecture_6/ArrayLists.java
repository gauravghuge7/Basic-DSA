import java.util.*;

public class ArrayLists {

    public static ArrayList<Integer>  allIndices(int[] arr, int n, int target, int idx) {

        if(idx == n) {
            return new ArrayList<>();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        if(arr[idx] == target) {
//            ans.add(idx);
        }
        
        ArrayList<Integer> smallAns = allIndices(arr, n, target, idx+1);

        ans.addAll(smallAns);
        return ans;

    }


    private static void print_indices(int[] arr, int index, int target) {

        if(index == arr.length) return;

        if(arr[index] == target) {
            System.out.println(index);
        }

        print_indices(arr, index + 1, target);
    }


    public static void main(String[] args) {
        
        int[] arr = {1,2,2,3,4,4,2,2,5,6,7,8,0,9,2};

        int target =2;
        int n = arr.length;

        ArrayList<Integer> ans = allIndices(arr, n, target, 0);

        System.out.println(ans);
        for(Integer i: ans) {
            System.out.println(i);
        }

    }    
}
