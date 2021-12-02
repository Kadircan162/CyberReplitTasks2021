package assignmentOnStringAndMethodsDay29;

import java.util.Arrays;

public class Q10PrintInfoFromEmail {
    public static void main(String[] args) {
        String email = "craig_federighi@apple.com";
        String[] info = {"First name", "Last name", "Domain", "Top-Level Domain"};
        String[] arr = email.split("[_@.]");
        System.out.println(Arrays.toString(arr));
        arr[0] = arr[0].substring(0,1).toUpperCase().concat(arr[0].substring(1));
        arr[1] = arr[1].substring(0,1).toUpperCase().concat(arr[0].substring(1));

        for(int i=0; i<info.length; i++){
            System.out.println(info[i] + ": " + arr[i]);
        }
    }
}
