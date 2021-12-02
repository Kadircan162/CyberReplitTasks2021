package assignmentOnStringAndMethodsDay29;

public class Q9SwapFirstnameWithLastname {

    public static void main(String[] args) {
        String email = "mike_tyson@gmail.com";
        String dummy = "";
        int i= email.indexOf('_');
        int j = email.indexOf('@');

        dummy = email.substring(i+1,j).concat("_").concat(email.substring(0, i));
        System.out.println(dummy);

        System.out.println("**************************");

        SwapWithSplit(email); // second way of swapping
    }
    public static void SwapWithSplit(String email){
        String s = email.split("@")[0];
        String[] arr = s.split("_");

        email = arr[1].concat("_").concat(arr[0]);
        System.out.println(email);
    }
}
