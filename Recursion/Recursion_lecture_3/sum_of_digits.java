public class sum_of_digits {


    /**
     *
     * Count all Digits in the A Number
     * @param n
     * @return
     */
    private static int count_Digits(int n) {
        if(n > 0 && n < 10) return 1;

        int previous = count_Digits(n / 10);

        return previous + 1;
    }

    private static int sum_digits(int n) {

        /**
         *  Base Case :  if number between the - to 9 return current number
         */
        if(n <= 9 && n >= 0) return n;

        /**
         *  Previous sum
         */
        int temp = sum_digits(n / 10);

        /**
         * Current Sum
         */
        int sum = n % 10;

        /***
         *   previous Digits Sums + Current Digit
         */
        return sum + temp;
    }

    public static void main(String[] args) {


        System.out.println(sum_digits(5234));

        System.out.println(count_Digits(34253457));

    }
}
