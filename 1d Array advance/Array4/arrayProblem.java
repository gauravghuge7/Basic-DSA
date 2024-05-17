import java.util.*;
class arrayProblem {

    static void swap(int a, int b) {

        a = a+b;
        b=a-b;
        a=a-b;

    }

    static void printArray(int[] arr) {

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void reverseArray(int[] arr) {

        int n = arr.length;
        int j=0;
        int[] ans = new int[n];

        for (int i=n-1; i>=0; i--) {
            ans[j++] = arr[i];
        }

        printArray(ans);
        
    }

    static void rotateArray(int[] arr,int k) {
        int n = arr.length;

        k = k %n;

        int[] ans = new int[n];

        for(int i=0; i<n-k; i++) {
            ans[i] = arr[i];
        }

    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }


        reverseArray(arr);

    }
}
