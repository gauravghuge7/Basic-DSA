


class Integer {


// TODO : Q5. Given a string, recursively implement atoi() or Integer.parseInt() method on it without actually
// TODO : using the method.

    /**
     * TODO :
     *
     * String to Integer
     * 298
     * 298
     *
     * 011
     * 11
     * @param s
     * @return
     */
    public static int parseInt(String s) {

        if(s.isEmpty()) return 0;


        if(s.charAt(0) == '0') return 0;

        return 0;

    }
}

public class conversion_Integer {




    public static void main(String[] args) {
        String s = "211";


        System.out.println(Integer.parseInt(s));
    }

}
