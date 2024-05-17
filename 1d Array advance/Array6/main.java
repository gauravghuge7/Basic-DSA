import java.util.*;
import java.lang.*;
class main {


    static int[] makePrefix(int[] arr) {
        int n = arr.length;

        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++) {
            prefix[i] += arr[i];
        }
        return prefix;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter array size");
        int n = scan.nextInt();
        System.out.println("Enter array elements");

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }


        int[] prefix = makePrefix(arr);

        for(int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }

    }
}