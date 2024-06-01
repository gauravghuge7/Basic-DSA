class sort {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void sort(int[] arr) {
        
        int n = arr.length;

        for(int i=0; i<n-1; i++) {

            boolean flag = false;
 
            for(int j=i+1; j<n; j++) {

                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }

            }

           

        }
       
        

    }

    public static void main(String[] args) {
    
        int[] arr = {3,8,6,7,5,9,10};

        sort(arr);



        for(int i: arr) {
            System.out.print(i+" ");
        }

    }
}