import java.util.ArrayList;

public class subset {
    
    
    static ArrayList <String> getSubset(String s) {

        ArrayList<String> ans = new ArrayList<>();

        if(s.length() == 0) {
            return ans;
        }

        char current = s.charAt(0);

        ArrayList <String> smallAns = getSubset(s.substring(1));

        for (String string : smallAns) {
            ans.add(string);
            ans.add(string);
        }
        return ans;

    }
    
    public static void main(String[] args) {
        
        String s = "abc";

        ArrayList <String> ans =  getSubset(s);

        System.out.println(ans);
    }
}
