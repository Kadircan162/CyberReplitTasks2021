package ReplitAssignments2021;

public class CoverCharsWords {
    public static void main(String[] args) {
        System.out.println(coverString("hello hello", "ellot"));
    }
    public static String coverString(String main, String coverME) {
        // your code here
        String dummy = "";
        int pointer=0;
        int index = 0;

        for(int i=0; i<main.length(); i+=coverME.length()){
            index = main.indexOf(coverME, pointer);
            if(index != -1){
                dummy += main.substring(pointer,index).concat("[" + coverME + "]");
                pointer = index + coverME.length();
            }
        }
        dummy += main.substring(pointer);

        if(pointer == 0){
            dummy = "[" + main + "]";
            return dummy;
        }else{
            return dummy;
        }
    }
}
