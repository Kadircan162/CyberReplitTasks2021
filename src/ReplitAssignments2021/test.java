package ReplitAssignments2021;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String sr = "a&/e,d$";
        System.out.println(sr);
        String sr2 = sr;
        char c1 = ' ';
        char c2 = ' ';
        for (int i = 0; i < sr.length(); i++) {
            c1 = sr.charAt(i);
            for (int j = sr.length() - 1; j > 0; j--) {
                c2 = sr.charAt(j);
            }
            sr2 = sr2.replace("" + c1, "" + c2); // $&/e,d$
            System.out.println(sr2);

        }
    }
}
