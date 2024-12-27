public class Merge2Strings {

    private static String merge(String a, String b, int idx) {
        if(Math.max(a.length(), b.length()) == idx) {
            return "";
        }

        String temp = merge(a, b, idx + 1);

        if(idx < b.length()) {
            temp = b.charAt(idx) + temp;
        }
        if(idx < a.length()) {
            temp = a.charAt(idx) + temp;
        }


        return temp;
    }

    public static void main(String[] args) {

//        String a = "abet";
//        String b = "po";

        String a = "abcd";
        String b = "efgh";

        /**
         *
         * abcd
         * efgh
         * aebfcgdh
         *
         * abet
         * po
         * apboet
         */


        System.out.println(merge(a, b, 0));
    }
}
