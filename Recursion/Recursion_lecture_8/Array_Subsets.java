import java.util.ArrayList;

public class Array_Subsets {

    private static ArrayList<Integer> subset_Sum(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        insert(nums, new ArrayList<>(), 0, 0);

        return ans;
    }

    private static void insert(int[] nums, ArrayList<java.lang.Integer> arr, int sum, int i) {

        if(i == nums.length) {
            System.out.println(sum);
//            arr.add(sum);
            return;
        }


        insert(nums, arr, sum + nums[i], i+1);

        insert(nums, arr, sum, i+1);


    }


    public static void main(String[] args) {

        int[] arr = {2, 4, 5};


        subset_Sum(arr);

    }
}
