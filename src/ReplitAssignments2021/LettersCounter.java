package ReplitAssignments2021;

public class LettersCounter {
    public static void main(String[] args) {
        System.out.println(countLetters("aaabbcccc"));

    }
    public static String countLetters(String str){
        String output = "";
        int index;
        int counter;
        while (!str.isEmpty()){ //for each iteration, searched char is replaced with ""
          index = 0;
          counter = 0;
          char c = str.charAt(index);
            for (int j=0; j<str.length(); j++){
                if(c == str.charAt(j)){
                counter++;
                }
            }
          output += (counter) + "" + c;
          str = str.replace(""+c, "");
        }
        return output;
    }
}
