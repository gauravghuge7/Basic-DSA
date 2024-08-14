class insert {

    static void insertionSort(int[] arr) {

        int n = arr.length;

        for(int i=0; i<n-1; i++) {

            int key = arr[i];
            
            int j = i-1;    

            while(j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;

        }
    }



    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,7,8};

        insertionSort(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}