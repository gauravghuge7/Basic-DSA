public class After_UpperCase_Substring {


    private static String after_UpperCase(String s) {

        if(s.isEmpty()) return "";

        if(Character.isUpperCase(s.charAt(0))) {
            return s;
        }

        return after_UpperCase(s.substring(1));
    }
    public static void main(String[] args) {

        String s = "collegeWallah";

        System.out.println(after_UpperCase(s));
    }
}
