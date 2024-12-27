public class remove_occurance {



    private static String removeOccu(String s, int index, char ch) {

        if(index == s.length()) return "";

        String temp = removeOccu(s, index + 1, ch);

        if(s.charAt(index) != ch) {
            temp += s.charAt(index);
        }

        return temp;
    }

    private static String removeOccB(String s, int index, char ch) {

        if(s.length() == 0) return "";

        String temp = removeOccB(s.substring(1), index + 1, ch);

        if(s.charAt(0) != ch) {
            return temp += s.charAt(0);
        }

        return temp;
    }

    public static void main(String[] args) {

        String s = "saaas";
        char ch = 'a';

//        System.out.println(removeOccu(s, 0, ch));

        System.out.println(removeOccB(s, 0, ch));
    }
}
