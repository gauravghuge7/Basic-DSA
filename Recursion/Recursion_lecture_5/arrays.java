
public class arrays {


    public static void printReverseArray(int[] arr, int idx) {

        if(idx == -1) {
            return;
        }


        //  self work 

        System.out.println(arr[idx]);

        printReverseArray(arr, idx-1);

    }
    
    
    public static void printArray(int[] arr, int idx) {

        if(idx == arr.length) {
            return;
        }


        //  self work 

        System.out.println(arr[idx]);

        printArray(arr, idx+1);

    }


    public static int sumOfArray(int[] arr, int index) {
        
        // base case
        if(index == arr.length) return 0;
        
        
        // big problem
        int sum = sumOfArray(arr, index+1);
        
        // self work
        return sum + arr[index];
    }
    
    public static int maxOfArray(int[] arr, int index) {

        // base case
        if(index == arr.length-1) {
            
            return arr[index];
        }

        //bigger problem 

        int smallAns = maxOfArray(arr, index+1);

        return Math.max(arr[index], smallAns);
    }


    private static int max(int[] nums, int index) {
        if(index == nums.length - 1) {
            return nums[index];
        }

        int small = max(nums, index + 1);


        return Math.max(small, nums[index]);
    }



    public static void main(String[] args) {

        int[] arr = {0,0,-2,1,0,1};
        
        // printArray(arr, 0);

        // System.out.println(sumOfArray(arr, 0));

//        System.out.println(maxOfArray(arr, 0));

        System.out.println(max(arr, 0));
    }    
}
