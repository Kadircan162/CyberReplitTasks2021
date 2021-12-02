package ReplitAssignments2021;

public class Palindrome {
    public static boolean isPalindrome(String check) {

        // your code here
        String newStr = check.replace(" ", "").toLowerCase();
        int backwardIndex=1;
        for(int forwardIndex=0; forwardIndex<newStr.length(); forwardIndex++){
            if(newStr.charAt(forwardIndex) != newStr.charAt(newStr.length()-backwardIndex)){
                return false;
            }
            backwardIndex++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("eNurses Rune"));
    }

}
