import java.util.ArrayList;

public class combinations {



    private static ArrayList<String> possible_Combo(String s) {

        ArrayList<String> ans = new ArrayList<>();

        String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        
        feed(s, keys, "");
        
        return ans;
    }

    private static void feed(String s, String[] keys, String s1) {

        if(s.isEmpty()) {
            System.out.println(s1);
            return;
        }

        int currNum = s.charAt(0) - '0';

        String currChoices = keys[currNum]; // choices

        for(int i=0; i<currChoices.length(); i++) {
            feed(s.substring(1), keys, s1+currChoices.charAt(i));
        }
    }


    public static void main(String[] args) {

        String s = "253";


        System.out.println(possible_Combo(s));
    }
}
