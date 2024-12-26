

public class armStrong_Number {


    private static int isArmStrong(int n) {

        if(n == 0) return 0;

        int unit = n % 10;

        int small = (unit * unit * unit) + isArmStrong(n / 10);

        return small;
    }

    public static void main(String[] args) {

        System.out.println(isArmStrong(153));
    }
}
