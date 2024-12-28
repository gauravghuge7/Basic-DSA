import java.util.ArrayList;

public class subset {

    private static ArrayList<String> subset_Rec(String s) {
         ArrayList<String> ans = new ArrayList<>();

         if(s.isEmpty()) {
             ans.add("");
             return ans;
         };

         char ch = s.charAt(0);
         ArrayList<String> smallAns = subset_Rec(s.substring(1));

         for(String s1 : smallAns) {
             ans.add(s1);
             ans.add( ch+s1 );
         }

         return ans;
    }

    private static void print_Subsets(String s, String curr) {

        if(s.isEmpty()) {
            System.out.println(curr);
            return;
        }

        String remain = s.substring(1);
        char current = s.charAt(0);

        print_Subsets(s.substring(1), curr + current);
        print_Subsets(s.substring(1), curr);

    }


    private static void print_Subsets_iterative(String s) {

        int n = s.length();


        for(int i=0; i<n; i++) {

            for(int j=i; j<=n; j++) {

                System.out.println(s.substring(i, j));
            }
        }
    }
    
    public static void main(String[] args) {
        
        String s = "abc";

        ArrayList <String> ans =  subset_Rec(s);

//        System.out.println(ans);

//        print_Subsets(s, "");

        print_Subsets_iterative(s);
    }
}
