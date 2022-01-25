package day20Tasks_StringMethods;

public class FrequencyOfChars {



    public static void main(String[] args) {
        System.out.println(frequency("aabcd", 'a'));
        System.out.println(uniqueCharacters("abccc"));
    }
    public static int frequency (String string, char c){
            int count = 0;
            for(int i=0; i<string.length(); i++){
                if(string.charAt(i) == c){
                    count++;
                }
            }
            return count;
    }
    public static String uniqueCharacters(String str){


        String uniqueChars = "";
        for(int i=0; i<str.length(); i++){
            if(frequency(str,str.charAt(i)) == 1){
                uniqueChars += str.charAt(i);
            }
        }
        return uniqueChars;
    }
}
