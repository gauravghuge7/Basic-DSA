public class lowerCase_Count {


    private static int count_lowerCase(String s) {
        if(s.isEmpty()) return 0;

        if(Character.isLowerCase(s.charAt(0))) {
            return 1 + count_lowerCase(s.substring(1));
        }
        return count_lowerCase(s.substring(1));
    }


    public static void main(String[] args) {

        String s = "";

        System.out.println(count_lowerCase(s));
    }
}
