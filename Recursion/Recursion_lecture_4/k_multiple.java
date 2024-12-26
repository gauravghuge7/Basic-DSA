public class k_multiple {


    private static void print_k_multiple(int n, int k) {

        /*
          Base Case
         */
        if(k == 0) return;

        /******
         *  REcursive Work
        */
        print_k_multiple(n, k - 1);


        /*
         * Self Work
         */
        System.out.println(n * k);


    }

    public static void main(String[] args) {


        print_k_multiple(12, 5);

    }
}

