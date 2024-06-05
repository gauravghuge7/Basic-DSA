public class chocalates {

    static boolean isPossible(int[] arr, int m, int mid) {

        int numberOfStudents = 1;

        int chocalates = 0;

        for(int i=0; i<arr.length; i++) {

            if(arr[i] == mid) {
                return false;
            }

            if(chocalates + arr[i] <= mid) {
                chocalates += arr[i];
            }

            else {
                numberOfStudents++;
                chocalates = arr[i];
            }
        }

        return numberOfStudents <= m;
    }



    static int distributeChocolates(int[] arr, int m) {

        int n = arr.length;

        if(n < m) return -1;


        int ans = 0;

        int start = 1;
        int end = (int) 1e9;


        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(isPossible(arr, m, mid)) {
                ans = mid;
                end = mid-1;
            }

            else {
                start = mid + 1;
            }
        }

        return ans;

    }


    public static void main(String[] args) {
        
        int[] arr = {12, 34, 67, 90};

        System.out.println(distributeChocolates(arr, 2));


    }
}
