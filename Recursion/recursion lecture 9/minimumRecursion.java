class minimumRecursion {

    public static int best(int[] h, int n, int idx) {

        if(idx == h.length)  {
            return 0;
        }

        int option1 = Math.abs(h[idx] - h[idx +1] + best(h, n, idx+1));
        if(idx == n-2) return option1;

        int option2 = Math.abs(h[idx]- h[idx+2] + best(h, n, idx+2));

        return Math.min(option1, option2);
    }

    public static void main(String[] args) {

        int[] h = {1,2,3};

        int n = h.length;

        best(h, n, 0);

    }
}