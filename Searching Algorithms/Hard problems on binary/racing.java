public class racing {

    static boolean isPossible(int[] arr, int k, int mid) {

        int kidPlaced = 1;

        int lastKid = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] - lastKid >= mid) {
                kidPlaced++;
                lastKid = arr[i];
            }
        }

        return kidPlaced >= k;

    } 

    static int racingTrack(int[] arr, int k) {

        int n = arr.length;

        if(k > n) return -1;

        int ans = -1;
        int start = 1;
        int end = (int) 1e9;
        while (start <= end) {
            
            int mid = start + (end - start) / 2;

            if(isPossible(arr, k, mid)){

                ans = mid;

                end = mid -1;

            }
            else {
                start = mid +1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,4,8,9};

        int target = 3;
        
        System.out.println(racingTrack(arr, target));
    }
}
