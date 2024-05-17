class recursion {


    public static void printIncreasing(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        }

        printIncreasing(n-1);
        System.out.println(" "+n);
    }
    public static void printDecreasing(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        } 

        System.out.println(n);

        printDecreasing(n-1);
        
    }

    


    public static void main(String[] args) {
        System.out.println("Hello World");

        // printIncreasing(10);

        printDecreasing(9);

    }
}