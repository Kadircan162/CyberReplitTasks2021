package assignmentOnStringAndMethodsDay29;

public class Q6ReverseWord {
    public static void main(String[] args) {

        String word = "apple";
        reverse(word);

    }
    public static void reverse(String input){
        if(input.length() < 5){
            System.out.println("Too short!");
            return;
        }
        if(input.length() > 5){
            System.out.println("Too long!");
            return;
        }
        String dummy = "";
        int index = input.length();

        for (int i=0; i<input.length(); i++){
            dummy += input.substring(index-1, index);
            index--;
        }
        System.out.println(dummy);
    }
}
