package ReplitAssignments2021;

public class RegularExpressionUsage {
    public static void main(String[] args) {
        String s = "1234Asc%#ade";

        System.out.println(s.replaceAll("[a-zA-Z]",""));
        System.out.println(s.replaceAll("[0-9]",""));
        System.out.println(s.replaceAll("[^a-zA-Z]",""));
        System.out.println(s.replaceAll("[^0-9]",""));
        System.out.println(s.replaceAll("[^0-9a-zA-Z]",""));
    }
}
