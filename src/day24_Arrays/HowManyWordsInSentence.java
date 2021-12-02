package day24_Arrays;

public class HowManyWordsInSentence {
    public static void main(String[] args) {
        String str = "w,e, we weeeeee weew ,ewew, wewew wewe";
        String[] array = str.split(" ");
        System.out.println(array.length);
        for(int i=0; i<array.length; i++){
            if(array[i].split(",")[0].isEmpty()){
                System.out.println(array[i].split(",")[1]);
            }else{
                System.out.println(array[i].split(",")[0]);
            }

        }
        for(String words : array){
            System.out.print(words.split(",")[0] + " ");
        }
        System.out.println();
        System.out.println(array[4].split(",")[0].split(",")[0]);

        boolean b = false;
        for (String words : array){
            if(words.split(",")[0].isEmpty()){
                if(words.split(",")[1].split(",")[0].equalsIgnoreCase("ewew")){
                    b = true;
                    break;
                }
            }else if(words.split(",")[0].split(",")[0].equalsIgnoreCase("ewew")){
                b = true;
                break;
            }
        }
        System.out.println(b);
    }
}
