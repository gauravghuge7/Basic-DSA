class quick {

    public static void display(int[] arr) {

        for(int i: arr) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];

        int cnt = 0;

        

        for(int i = st + 1; i < end; i++) {
            if(arr[i] < pivot) cnt++;

        }

        



        return 0;
    }


    public static void quickSort(int[] arr, int st, int end) {
        if(st <= end) return;

        int pi = partition(arr, st, end);

        quickSort(arr, st, pi-1);

        quickSort(arr, pi+1, end);


    }




    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 9, 2, 5, 6, 7, 8};
    }
}