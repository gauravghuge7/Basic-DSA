public class recursive {


    static boolean search(int[] arr, int start, int end, int target) {

        if(start > end) return false;

        int mid = start + (end - start) / 2;

        if(arr[mid] == target) {
            return true;
        }

        else if(arr[mid] > target) {
            return search(arr, start, mid-1, target);
        }

        else {
            return search(arr, mid+1, end, target);
        }
    }
    
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int target = 5;
        int start = 0;
        int end = arr.length-1;
        
        while(target>0) {
            
            System.out.printf("the number is %d is %b",target, search(arr, start, end, target));
            
            System.out.println();
            target--;
        }

        System.out.println(search(arr, start, end, target));

    }
}
