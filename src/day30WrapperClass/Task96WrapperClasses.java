package day30WrapperClass;

public class Task96WrapperClasses {

    public static final String ACTION = "Try";

    public static void main(String[] args) {
        String str = "Hello hello. Today ahttps://github.com/Kadircan162/CyberReplitTasks2021/blob/b5d9f22c4cccbc86f54e534df5117a86e4c0feef/src/day30WrapperClass/VarArgs.javand tomorrow is sunny and 72 degree and I'm so happy. It is a perfect day to practice java.";
        String[] strArr = str.replaceAll("[.]", "").split(" ");
        double fahr=0.0;

        for(int i=0; i<strArr.length; i++){
            if(strArr[i].equals("degree")){
                fahr = Double.parseDouble(strArr[i-1]);
            }
        }

        //(32°F − 32) × 5/9 = 0°C

        double celcius2 = (fahr-32)*5/9;

        System.out.println(fahr + " is equal to " + Math.round(celcius2) + " celcius");





    }
}
