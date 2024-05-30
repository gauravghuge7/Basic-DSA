public class combo {

    public static void combination(String[] kp, String a, String res) {
        if (a.length() == 0)  {
            System.out.println(res);
            return;
        }

        int currentNum = a.charAt(0) - '0';

        String currentChoice = kp[currentNum];

        for(int i=0; i<currentChoice.length(); i++) {
            combination(kp, a.substring(1), res + currentChoice.charAt(i));
        }

    }


    public static void main(String[] args) {

        String str[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        String s = "23";
        

        combination(str, s, s);


         
    }
}
