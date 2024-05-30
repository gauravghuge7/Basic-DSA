package Radix;

class radics {


    static void display(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }


    static int max(int[] arr) {


        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static void count(int[] arr, int place) {

        int n = arr.length;

        int[] output = new int[n];

        for(int i=0; i<n; i++) {
            output[i] = arr[i]/place;
        }

        
        


        int max = max(arr);

        
        for(int i=0; i<n; i++) {

            if(output[i] == max/place) {
                output[i] = max;
            }
        }

        // coping the all numbers to the main array
        for(int i=0; i<n; i++) {
            arr[i] = output[i];
        }

    }


    static void radixSort(int[] arr) {

        // get the biggest number 
        int max = max(arr);

        // count the number of digits in the biggest number

        for(int place = 1; max/place > 0; place *= 10) {
            count(arr, place);
        }


    }



    
    public static void main(String[] args) {
        
    }
}