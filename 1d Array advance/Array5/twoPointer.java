class twoPointer {

    static void printArray(int[] arr) {
        System.out.println();
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sortZero(int[] arr) {

        int zeroes = 0;
        int n =arr.length;

        for (int i=0; i<n; i++) {

            if(arr[i] ==0) {
                zeroes++;
            }
        }

        for (int i=0; i<n; i++) {
            if(i<zeroes) {
                arr[i] = 0;
            }
            else {
                arr[i] =1;
            }
        }
        
    }

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        

    } 

    static int[] sortByPointer(int[] arr) {

        int n =arr.length;

        int left=0, right=n-1;

        while(left < right) {

            if(arr[left] == 1 && arr[right] == 0) {

                swap(arr, left, right);
                left++;
                right--;
            }

            if(arr[left] ==0) {
                left++; 
            }

            if(arr[right] ==1) {
                right--;
            }
        }

        
        return arr;

    }


    public static void main(String[] args) {
        
        int[] arr ={0,1,0,1,0,1,0,1};
        
        //  sortZero(arr);

        sortByPointer(arr);




        printArray(arr);

    }
}