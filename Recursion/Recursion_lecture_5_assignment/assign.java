
public class assign {
    
    public static void generate(int[] arr, int index) {

        // base case 
        if(index == arr.length-1) {
            return;
        } 

        /// bigger problem 
        System.out.println(arr[index]+" "+arr[index+1]);

        generate(arr, index+1);

        // self work
        

    }
    
    
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4};

        generate(arr, 0);
    }
}
