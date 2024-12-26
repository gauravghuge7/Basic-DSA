public class factorial_problem {


    private static int fact(int n) {
        /**
         * Base Case
         */

        if(n == 0) return 1;

        /**
         * Self Work and function call
         */
        return n * fact(n -1);
    }


    public static void main(String[] args) {

        System.out.println("answer => "+fact(5));

    }
}
