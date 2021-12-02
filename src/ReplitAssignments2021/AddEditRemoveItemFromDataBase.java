package ReplitAssignments2021;

import java.util.Scanner;

public class AddEditRemoveItemFromDataBase {
    public static void main(String[] args) {
        Monkey[] monkeysHindu = new Monkey[3];
        monkeysHindu[0] = new Monkey("Hindu1");
        monkeysHindu[1] = new Monkey("Hindu2");
        monkeysHindu[2] = new Monkey("Hindu3");

        System.out.println("*************************");
        monkeysHindu[0].type = "Hindu1";
        System.out.println(monkeysHindu[1].type);
        monkeysHindu[0].sound();

        monkeysHindu[1].type = "Hindu2";
        System.out.println(monkeysHindu[1].type);
        monkeysHindu[0].sound();

        monkeysHindu[2].type = "Hindu3";
        System.out.println(monkeysHindu[1].type);
        monkeysHindu[0].sound();
        System.out.println("*************************");

    }
//    public static String lameDb(String db, String op, String id, String data) {
//        return null;
//    }//end lameDb

}
class Monkey {
    String type = "Spider Monkey";

    public Monkey(String type) {
        this.type = type;
    }

    public static void sound(){
        System.out.println("Uha uha uha");
    }

}

