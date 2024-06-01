
class quickSort {

    static void display(int[] arr) {

        for(int i: arr) {
            System.out.print(i + " ");
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition (int[] arr, int st, int end) {
        int pivot = arr[st];

        

        int count =0;

        for(int i=st+1; i<= end; i++) {
            if(arr[i] < pivot) count++;
        }

        int pivotIdx = st + count;

        swap(arr, st, pivotIdx);

        int i=st, j=end;
        while(i<pivotIdx && j>pivotIdx) {
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i<pivotIdx && j>pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIdx;

    }

    static void sort(int[] arr, int st, int end ) {
        
        if(st < end ) return;

        int pi = partition(arr, st, end);
        sort(arr, st, pi-1);
        sort(arr, pi+1, end);
    }

    


    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};

        sort(arr, 0, arr.length-1);

        display(arr);
    }
}