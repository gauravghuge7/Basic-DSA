import java.util.ArrayList;

public class raw {

    public static ArrayList<String> demo(String s) {
        
        ArrayList<String> ans = new ArrayList<>();

        if(s.length() == 0) {
            return ans;
        }
        System.out.println(s);

        ArrayList <String> smallAns = demo(s.substring(1));

        ans.addAll(smallAns);
        ans.addAll(smallAns);

        return ans;


    }



    public static void main(String[] args) {
        
        String s = "HarshadaKhade";

        ArrayList <String>  ans = demo(s);

        System.out.println(ans);

        for (String string : ans) {
            System.out.println(string);
        }




    }
}
