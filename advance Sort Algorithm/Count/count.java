import java.lang.*;

class count {

    public static void display(int[] arr) {

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

    
    static void basicSort(int[] arr) {
        int n = arr.length;

        int max = max(arr);

        int[] ans = new int[max+1];

        for(int i=0; i<n; i++) {
            ans[arr[i]]++;
        }

        int k = 0;

        for(int i=0; i<ans.length; i++) {

            for(int j=0; j<ans[i]; j++) {
                arr[k++] = i;
            }
        }
        
        
    

    }

    public static void main(String[] args) {
        

        int[] arr = {8,5,2,6,6,1,7,3,4};


        basicSort(arr);

        display(arr);





    }
}