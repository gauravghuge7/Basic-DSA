class removeChar {

    public static String removeA(String s, int idx) {

        if(idx == s.length()) return "";

        String smallAns = removeA(s, idx+1);

        char currentChar = s.charAt(idx);

        if(currentChar != 'a') {
            return currentChar + smallAns;
        }

        return smallAns;

        


    }
    
    public static String removeA2(String s) {
        if(s.length() == 0) return "";

        String smallAns = removeA2(s.substring(1));

        char currentChar = s.charAt(0);

        if(currentChar != 'a') {
            return currentChar + smallAns;
        }

        return smallAns;
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {


        String s = "harshada khade";


    //    System.out.println(removeA(s, 0));

    System.out.println(removeA2(s));

    }
}