package day24_Arrays;

public class CreatePassword_Task94_secondversion {
    public static void main(String[] args) {
        String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
        String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
        createPassword(info1, info2);
    }
    public static void createPassword(String info1, String info2){
        String[] array = info1.split(" ");
        String output = "";
        String dummy ="";
        for(String word : array){ // first method of finding xxxCD132Gxxx
            for(int i=0; i<word.length(); i++){
                dummy += word.charAt(i);
                if(dummy.equalsIgnoreCase("xxx")){
                    output += word.split("xxx")[1].split("xxx")[0];
                    break;
                }
            }
        }
        array = info2.split(" ");
        for (String word : array){          // second method of finding xxx00ABC!xxx
            if(word.replaceAll("[^xxx]", "").equalsIgnoreCase("xxxxxx")){
                output += word.split("xxx")[1].split("xxx")[0];
            }
        }
        System.out.println(output);
    }
}
