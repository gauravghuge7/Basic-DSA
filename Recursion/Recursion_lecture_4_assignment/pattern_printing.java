public class pattern_printing {
    /**
     *
     * Given a number n, print the following pattern without using any loop.
     * n, n-5, n-10, ..., 0, 5, 10, ..., n-5, n
     *
     * Input1: n = 16
     * Output1: 16, 11, 6, 1, -4, 1, 6, 11, 16
     * Input2: n = 10
     * Output2: 10, 5, 0, 5, 10
     */


    private static void print_pattern(int n, boolean flag) {

        if(n <= 0) {
            System.out.print(n+" ");
            return;
        }

        System.out.print(n+" ");
        if(flag) {
            print_pattern(n-5, false);


        }
        else {
            print_pattern(n - 5, true);

        }

        System.out.print(n+" ");
    }


    /**
     *
     * Second Question
     * @param args
     *
     * Find m-th summation of first n natural numbers where m-th summation of first n natural
     * numbers is defined as following:
     * If m > 1: SUM(n, m) = SUM(SUM(n, m - 1), 1)
     * Else :SUM(n, 1) = Sum of first n natural numbers.
     *
     * Input1: n = 3, m = 2
     * Output1: SUM(3, 2) = 21
     * Explanation : SUM(3, 2)
     * = SUM(SUM(3, 1), 1)
     * = SUM(6, 1)
     * = 21
     * Input2 : n = 4, m = 1
     * Output2 : SUM(4, 1) = 10
     */


    private static int n_num_summation(int n,int m) {

        if(m == 1) {
            return n * (n + 1) / 2;
        };

        return n_num_summation(n_num_summation(n, m-1), 1);

    }
    public static void main(String[] args) {

//            System.out.println((3 * (3 + 1)) / 2);

//        print_pattern(16, true);


        System.out.println(n_num_summation(40, 1));

    }

}
