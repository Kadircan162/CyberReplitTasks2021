package ReplitAssignments2021;

public class BeginsWithError {
    public static void main(String[] args) {
        System.out.println(isError("errorr invalid directory"));
    }
    public static boolean isError(String line) {
        int errorIndex = line.indexOf("error ");
        if(errorIndex != 0){
            return false;
        }
        return true;
    }
}
