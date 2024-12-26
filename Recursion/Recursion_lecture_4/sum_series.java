public class sum_series {


    private static int sum_same_sign(int n) {

        if(n == 0) return 0;


        int smallAns = n + sum_same_sign(n -1);

        return smallAns;
    }
    private static int sum_diff_sign(int n) {

        if(n == 0) return 0;

        if(n % 2 == 0) {
            return sum_diff_sign(n-1) - n;
        }

        return sum_diff_sign(n -1) + n;
    }

    public static void main(String[] args) {


//        System.out.println(sum_same_sign(5));

        System.out.println(sum_diff_sign(5));
    }
}

