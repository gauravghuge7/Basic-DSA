class demoPower {

    private static int power(int a, int b) {
        if(b == 0) return 1;

        int previous = power(a, b-1);

        int current = a;

        return previous * current;
    }

    public static void main(String[] args) {

        System.out.println(power(2, 1));

    }
}