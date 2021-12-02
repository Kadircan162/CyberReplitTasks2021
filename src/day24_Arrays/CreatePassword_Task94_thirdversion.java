package day24_Arrays;

public class CreatePassword_Task94_thirdversion {
    public static void main(String[] args) {
        String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
        String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
        createPassword(info1, info2);
    }
    public static void createPassword(String info1, String info2){
        String output = "";
        String dummy ="";
        String[] array = info1.split("xxx");
        output += array[1].split("xxx")[0];

        array = info2.split("xxx");
        output += array[1].split("xxx")[0];

        System.out.println(output);
    }
}
