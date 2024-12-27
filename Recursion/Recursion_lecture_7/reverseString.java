public class reverseString {


    private static boolean palidrome(String s, int start, int end) {
        if(start == end) return true;

        if(s.charAt(start) != s.charAt(end)) return false;

        return palidrome(s, start + 1, end -1);
    }
    private static String reverse(String s, int index) {
        if(index == s.length()){
            return "";
        }

        String temp = reverse(s, index + 1);


        return temp + s.charAt(index) ;
    }

    public static void main(String[] args) {


        String s = "DAD";

//        System.out.println(reverse(s, 0));

        String check = "DAD";

        System.out.println(palidrome(s, 0, s.length() - 1));
    }
}
