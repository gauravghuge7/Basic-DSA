class gcd_iteration {

    public static int gcd(int a, int b) {
        
        if (b == 0) {
            return a;
        }
        if (a == 0) {
            return b;
        }
        
        if(a > b) {
            for (int i = b; i > 0; i--) {
                if(a % i == 0 && b % i == 0) {
                    return i;
                }
            }
        }
        else {
            for (int i = a; i > 0; i--) {
                if(a % i == 0 && b % i == 0) {
                    return i;
                }
            }
        }
        return a;

    }


    public static void main(String[] args) {

        int a = 52;
        int b = 65;
        System.out.println(gcd(a, b));
        
    }
}