
class exists {

    static boolean search(int[] arr, int target, int n, int idx) {
        
        // base case
        if(idx == n) return false;



        if(arr[idx] == target) return true;


        return search(arr, target, n, idx+1);

    } 

    static int findFirstIndex(int[] arr, int target, int n, int idx) {
        
        // base case
        if(idx == n) return -1;



        if(arr[idx] == target) return idx;


        return findFirstIndex(arr, target, n, idx+1);

    } 


    

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 9, 6, 7, 9};

        int n = arr.length;
        
        int target = 9;

        // if(search(arr, target, n, 0) ) {
        //     System.out.println("Yes");
        // }
        // else {
        //     System.out.println("No");
        // }


        System.out.println(findFirstIndex(arr, target, n, 0));

        

    }
}