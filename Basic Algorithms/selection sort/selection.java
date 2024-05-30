
public class selection {

    static void selectionSort(int[] arr)  {
        int n = arr.length;
        
        for(int i=0; i<n-1; i++) {

            int min_index = i;

            for(int j=0; j<n-i-1; j++) {
    
                if(arr[j] < arr[min_index]) {
                    min_index = j;
                }

     
            } 

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {9,8,7,6,5,4,3,2,1};

        selectionSort(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
