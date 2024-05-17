
interface Innerassignment {
    
    void method();
}   

public class assignment {

    void method() {
        System.out.println("this is a method");
    }
    
    public static void main(String[] args) {
        
        int number = 153;

        int check = number;

        int sum = 0;

        while(number > 0) {

            int n = number % 10;

            int cube = n * n * n;

           sum += cube;

           System.out.println(cube);

            number /= 10;

            System.out.println(number);
        }
      
        if (check == sum) {

            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
        
    }
}
