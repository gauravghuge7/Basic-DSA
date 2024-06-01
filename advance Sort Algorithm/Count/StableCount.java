public class StableCount {
    
    static void display(int[] arr) {

        for(int i: arr) {
            System.out.print(i+" ");
        }
    }

    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;


        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {

                max = arr[i];
            }
        }

        return max;
    }


    static void count(int[] arr) {

        int n = arr.length;

        int[] output = new int[n];

        int max = max(arr);

        int[] ans = new int[max+1];

      
        

        for(int i=0; i<n; i++) {
            ans[arr[i]]++;
        }

        for(int i=1; i<ans.length; i++) {
            ans[i] += ans[i-1];
        }

        

        for(int i=0; i<n; i++) {
            int idx = ans[arr[i]]-1;
            output[idx] = arr[i];
            ans[arr[i]]--;
        }

    


        // coping all elements to arr
        for(int i=0; i<n; i++) {

            arr[i] = output[i];
        }

    }
 
    public static void main(String[] args) {
        
        int[] arr = {8,5,2,6,6,1,7,3,4};

        count(arr);

        display(arr);
    }
}
