package ReplitAssignments2021;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LameDataBaseAddEditRemoveElements {
    public static void main(String[] args) {
        System.out.println(lameDb("1etsy#2eccdde#3ffecef","delete","3","creature"));
    }
    public static String lameDb(String db, String op, String id, String data) { //"1etsy#2wooden#3spoon","add","4","aaa"
        int indexOfPosition = Integer.parseInt(id)-1;
        if(indexOfPosition<0){
            System.out.println("Invalid id!!");
            return "";
        }
        String dummy1 = db.replaceAll("[^#]", "");
        String dummy2 = db.concat("#");

        String newDb="";
        String[] fileArray = new String[dummy1.length()+1];
        int numberOfElements = 0;
        for (int i=0; i<fileArray.length; i++){
            for (int j=0; j<dummy2.length(); j++){
                if(dummy2.charAt(j) == '#'){
                    fileArray[i] = "#" + dummy2.substring(dummy2.indexOf(dummy2.substring(0,1)),j+1);
                    dummy2 = dummy2.replace(dummy2.substring(dummy2.indexOf(dummy2.substring(0,1)),j+1),"");
                    numberOfElements++;
                    break;
                }
            }
        }
        fileArray[0] = fileArray[0].replace("#", "");

        System.out.println(Arrays.toString(fileArray));


        if(op.equals("add")){
            newDb = addElement(fileArray, id, data, numberOfElements, indexOfPosition);
        }else if(op.equals("edit")){
            newDb = editDb(fileArray, id, data, numberOfElements, indexOfPosition);
        }else if(op.equals("delete")){
            newDb = deleteElement(fileArray, id, data, indexOfPosition);
        }

        return newDb;
    }//end lameDb

    public static String addElement(String[] strArray, String id, String data, int numberOfElements, int indexOfPosition){
        String resultString = "";
        String[] biggerArray = biggerArray = new String[strArray.length+Integer.parseInt(id)];
        for(int i=0; i<strArray.length; i++){
            biggerArray[i] = strArray[i];
        }
            strArray = biggerArray;
            biggerArray = null;// ex-Arrays are garbaged collected
        if(indexOfPosition >= numberOfElements){
            indexOfPosition = numberOfElements;
        }

        for(int i=strArray.length-1; i>indexOfPosition; i--){
           strArray[i] = strArray[i-1];
       }
       for(int i=0; i<strArray.length && strArray[i]!=null; i++){
           strArray[i] = strArray[i].replaceAll("[^a-zA-Z]", "");
       }
        strArray[indexOfPosition] = data; //data inserted
        for(int i=0; i<strArray.length && strArray[i]!=null; i++){
            if(i==0){
                strArray[i] = String.valueOf(i+1).concat(strArray[i]);
            }else{
                strArray[i] = "#" + String.valueOf(i+1).concat(strArray[i]);
            }
            resultString += strArray[i];
        }
        return  resultString;
    }

    public static String editDb(String[] strArray, String id, String data, int numberOfElements, int indexOfPosition){
        if(indexOfPosition >= strArray.length){
            System.out.println("Id could not be found!!");
            return "";
        }
        String resultString = "";
        if(indexOfPosition == 0){
            strArray[indexOfPosition] = id + data;
        }else if(indexOfPosition<strArray.length){
            strArray[indexOfPosition] = "#" + id + data;
        }
        for (int i=0; i<strArray.length; i++){
            resultString += strArray[i];
        }
        return resultString;
    }
    public static String deleteElement(String[] strArray, String id, String data, int indexOfPosition){

            if(!Arrays.toString(strArray).replaceAll("[^0-9]","").contains("" + Integer.parseInt(id))){
                System.out.println("Id could not be found!!");
                return "";
            }

        for(int i=indexOfPosition; i<strArray.length-1; i++){
            strArray[i] = strArray[i+1];
        }
        strArray[strArray.length-1] = "";
        strArray[0] = strArray[0].replace("#", "");

        String resultString = "";
        for (int i=0; i<strArray.length; i++){
            resultString += strArray[i];
        }
        return resultString;
    }
}
