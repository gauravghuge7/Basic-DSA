public class GCD_Rec {

    private static int get_gcd_recursive(int a, int b) {

        if(b == 0) {
            return a;
        }

        return get_gcd_recursive(b, a % b);
    }


    public static void main(String[] args) {

        System.out.println(get_gcd_recursive(24, 9));
    }
}
