import java.util.ArrayList;

public class BinarySearch {

    static ArrayList<Integer> searchList(int[] arr, int target) {

        int n = arr.length;
        int start = 0; 
        int end = n-1;

        ArrayList<Integer> index = new ArrayList<>();

        while(start <= end) {

            int mid = start + (end -start) /2;

            if(arr[mid] == target) {
                index.add(mid);

                end = mid -1;
            }

            else if(arr[mid] > target) {
                end = mid-1;
            }

            else {
                start = mid +1;

            }

        }

        return index;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 5, 5, 4, 5, 5 ,5,5,5, 6, 7, 8, 9, 10};

        int target = 5;

        ArrayList<Integer> index = searchList(arr, target);

        System.out.println(index);

    }
}
