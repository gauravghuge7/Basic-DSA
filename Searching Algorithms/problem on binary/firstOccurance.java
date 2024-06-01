public class firstOccurance {

    static int firstOccure(int[] arr, int target) {

        int n = arr.length;

        int start = 0; 
        int end = n-1;
        int fo = -1;

        while(start <= end) {

            int mid = start + (end - start ) / 2;

            

            if(arr[mid] == target) {
                
                fo = mid;
                end = mid - 1;

            }

            else if (arr[mid] > target) {
                end  = mid -1;
            }

            else {
                start = mid + 1;
            }


        }

        return fo;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,2,3,4,5,6,7,8,9,10};

        int target = 2;

        System.out.println(firstOccure(arr, target));
        
    }
}
