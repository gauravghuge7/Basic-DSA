
public class recursion {

    public static int Igcd(int a, int b) {
        
        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }



    public static void main(String[] args) {
        
    }
}
