public class StringGoesIntoCurlyBrackets {

    public static void main(String[] args){

        String chars = "{{}}";
        String word = "AUTOMATION";

        String newWord = chars.substring(0,2) + word + chars.substring(2);

        System.out.println(word.equalsIgnoreCase("AU"));

        System.out.println(newWord);

        String str = " 342 ";
        System.out.println("|" + str.trim() + "|");
        System.out.println(str.replace(" ", "|"));
    }


}
