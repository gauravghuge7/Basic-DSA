
class basicBubble {

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

      /// alogorithm for the sortinig from backside of the array
      static void bubbleSort(int[] nums) {

            int n = nums.length;

            for(int i=0; i<n-1; i++) {

                  for(int j=0; j<n-i-1; j++) {

                        if(nums[j] > nums[j+1]) {
                              swap(nums, j, j+1);
                        }
                  }
            }

      }

      public static void main(String[] args) {
            
            int[] arr = {7,5,6,9,5,4,3,2,1};

            bubbleSort(arr);

            for(int i=0; i<arr.length; i++) {

                  System.out.print(arr[i] + " ");
            }
      }
}