package day33_Constructors.labQuestionsDay35;

import java.util.ArrayList;

public class RoulettePocket {
    private ArrayList<String> roulette;

    public RoulettePocket(){ //meaningless setting "int pocketNum" as the constructor argument
        roulette = new ArrayList<>(36);
        setRoulette();
    }

    public String getPocketColor(int pocketNum){
        if(pocketNum<0 || pocketNum>36){
            return "Invalid pocket number!";
        }

        return roulette.get(pocketNum);
    }

    private void setRoulette() {
        setColors();
    }
    private void setColors(){
        for(int i = 0; i<=36; i++){

            if(i == 0){
                roulette.add(0, "green");
            }
            if(i >= 1 && i <= 10){
                if(i%2 != 0){
                    roulette.add(i, "red");
                }else{
                    roulette.add(i, "black");
                }
            }
            if(i >= 11 && i <= 18){
                if(i%2 != 0){
                    roulette.add(i, "black");
                }else{
                    roulette.add(i, "red");
                }
            }
            if(i >= 19 && i <= 28){
                if(i%2 != 0){
                    roulette.add(i, "red");
                }else{
                    roulette.add(i, "black");
                }
            }
            if(i >= 29 && i <= 36){
                if(i%2 != 0){
                    roulette.add(i, "black");
                }else{
                    roulette.add(i, "red");
                }
            }

        }
    }
}
