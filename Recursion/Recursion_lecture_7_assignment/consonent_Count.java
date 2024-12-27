import java.util.HashSet;

public class consonent_Count {


    private static boolean isVowel(char c) {
        HashSet<Character> set = new HashSet<>();

        /**
         * lowercase
         */
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        /**
         * Uppercase
         */

        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        return set.contains(c);
    }
    private static int count_C(String s) {

        if(s.isEmpty()) return 0;

        if(isVowel(s.charAt(0))) {
            return count_C(s.substring(1));
        }

        return 1 + count_C(s.substring(1));
    }
    public static void main(String[] args) {

        String s = "college";


        System.out.println(count_C(s));



    }
}
