class demo {

    static int power(int n, int k) {
        if(k==1) {
            System.out.println(n);
            return n;
        }

        power(n,k-1);
        System.out.println(n*k);
        return n*k;
    }

    public static void main(String[] args) {
        
        power(5, 7);

    }
}