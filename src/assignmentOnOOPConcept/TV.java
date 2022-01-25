package assignmentOnOOPConcept;

import java.util.Scanner;

//Question-5
public class TV {

    int channel=1;
    int volumeLevel=0;
    boolean on = false;
    String brand = "undefined";

    public TV(){
        System.out.println("Creating TV object using no args-constructor");
    }

    public TV(String brand){
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public void channelUp(){
        if(channel == 120){
            return;
        }
        channel++;
    }
    public void channelDown(){
        if(channel<=0){
            return;
        }
        channel--;
    }
    public void volumeUp(){
        if(volumeLevel==7){
            return;
        }
        if(!isOn()){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
        volumeLevel++;
    }
    public void volumeDown(){
        if(volumeLevel==0){
            return;
        }
        volumeLevel--;
    }
    public boolean isOn(){
        return on;
    }
    public void turnOn(){
        if(isOn()){
            System.out.println("TV is already ON");
            return;
        }
        this.on = true;
    }
    public void turnOff(){
        if(!isOn()){
            System.out.println("TV is already OFF");
            return;
        }
        this.on = false;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel <=0 || channel > 120 || !isOn()){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
            return;
        }
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {

        if(volumeLevel<=0 || volumeLevel>=7 || !isOn()){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
            return;
        }

        this.volumeLevel = volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}

class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TV tv = new TV();
        System.out.println(tv.getVolumeLevel());
        tv.turnOff();
        tv.setChannel(in.nextInt());

        TV tv2 = new TV(in.next());
        tv2.turnOn();
        tv2.turnOn();
        tv2.setChannel(in.nextInt());
        tv2.setChannel(in.nextInt());
        tv2.setVolumeLevel(in.nextInt());
        tv2.volumeUp();
    }
}
