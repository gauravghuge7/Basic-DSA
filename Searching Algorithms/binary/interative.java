

class iterative {


    static boolean Search(int[] arr, int target) {

        int st=0, end=arr.length-1;

        while(st<=end){

            int mid = st + (end -st) / 2;

            if(arr[mid] == target) {
                return true;
            }

            else if(arr[mid] < target) {
                st = mid+1;

            }

            else {
                end = mid-1;
            }
        }


        return false;
    }


    public static void main(String[] args) {
        

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
  
        int target = 15;
        
        while(target!=0) {

            System.out.printf("the number is %d is %b",target,Search(arr,target));

            System.out.println();
            target--;
        }

    }
}