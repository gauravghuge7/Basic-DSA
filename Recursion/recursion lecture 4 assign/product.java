public class product {
    public static int product(int x, int y) {
        if (y == 0) {
            return 0;
        } 
        
        return x + product(x, y - 1);
        
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        System.out.println("Product of " + x + " and " + y + " is " + product(x, y));
    }
}