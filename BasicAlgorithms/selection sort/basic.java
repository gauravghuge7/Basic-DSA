

public class basic {

      static void printArray(int[] arr) {

            for(int i=0; i<arr.length; i++) {

                  System.out.print(arr[i]+" ");
            }
      }

      static void swap(int[] arr, int i, int j) {

            int temp = arr[i];
            arr[i] = arr[j];

            arr[j] = temp;

      }

      
      static void selectionSort(int[] nums) {

            int n = nums.length;

            for(int i=0; i<n-1; i++) {
                  
                  int min = i;
                  for(int j=i+1; j<n; j++) {
                        
                        if(nums[min] > nums[j]) {
                              min = j;
                        }
                  }
                  swap(nums, i, min);

            }
      } 

      public static void main(String[] args) {

            int[] arr = {7,5,6,9,5,4,3,2,1};

            selectionSort(arr);

            printArray(arr);
            
      }
}
