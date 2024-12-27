
public class exists_assign {
    
    static int search(int[] arr, int target, int idx) {
        
        if(idx == -1) {
            return -1;
        }

        if(arr[idx] == target) return idx;

        return search(arr, target, idx-1);

        

    }


    static boolean sortORnot(int[] arr, int n, int idx) {
        
        // base case 
        if(idx == n) return true;

        if(!(arr[idx] <= arr[idx+1])) {
            return false;
        }
        return sortORnot(arr, n, idx+1);

    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4, 9,5,6, 6,7};

        int target =6;
        int n = arr.length-1; 

        if(sortORnot(arr, n, 0)) {
            System.out.println("Yes sorted");
        }
        else {
            System.out.println("not sorted");
        }
        
    }

    
}
