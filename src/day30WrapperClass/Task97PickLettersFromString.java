package day30WrapperClass;

public class Task97PickLettersFromString {
    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.|| I love Java }{";
        String grabStr = "Welcome to core Java I love Java ";
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i)) || str.charAt(i) == ' '){
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
        System.out.println("**********************************");
        System.out.println(GrabSentence(str, grabStr));
    }

    public static String GrabSentence (String str, String grabString) {

        String newSen = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < grabString.length(); j++) {
                if (str.charAt(i) == grabString.charAt(j)) {
                    newSen += Character.toString(str.charAt(i));
                    j = i;
                    break;

                }
            }

        }
        if(newSen.length() != grabString.length()){
            return "Could not find the sentence you search.";
        }else{
            return newSen;
        }
    }
}
