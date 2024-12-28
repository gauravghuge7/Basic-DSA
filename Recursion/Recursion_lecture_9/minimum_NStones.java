public class minimum_NStones {





    public static void main(String[] args) {

        int[] nums = {10, 30, 40, 20};

        int ans = solve(nums);


        System.out.println(ans);
    }

    private static int solve(int[] nums) {


        return minimum(nums, 0);
    }

    private static int minimum(int[] nums, int index) {

        if(index >= nums.length -1) return 0;
        int include = Math.abs(nums[index] - nums[index + 1]) + minimum(nums, index + 1);

        if(index == nums.length - 2) return include;
        int exclude = Math.abs(nums[index] - nums[index + 2]) + minimum(nums, index + 2);

        return Math.min(include, exclude);
    }
}
