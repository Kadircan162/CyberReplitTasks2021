package assignmentOnArrayNovDay17;

public class ReadEmailByIncludesNameQ8 {
    public static void main(String[] args) {
        String email = "thunder blaz is the best drink in the galaxy...";
        if(email.toLowerCase().contains("alejandro")){
            System.out.println("read this mail");
        }else{
            System.out.println("don't read");
        }
    }
}
