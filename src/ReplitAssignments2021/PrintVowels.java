package ReplitAssignments2021;

public class PrintVowels {
    public static void main(String[] args) {
        String input = "huehuehuehue";
        String vowels = "aeiou";
        String output = "";

        for (int i=0; i<input.length(); i++){
            for (int j=0; j<vowels.length(); j++){
                if(input.charAt(i) == vowels.charAt(j)){
                    output += input.charAt(i);
                    break;
                }
            }
        }
        System.out.println(output);
    }
}
