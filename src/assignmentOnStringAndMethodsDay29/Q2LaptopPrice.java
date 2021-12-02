package assignmentOnStringAndMethodsDay29;

import java.util.Scanner;

public class Q2LaptopPrice {
    double screenSize;
    String cpuType;
    int ramSize;
    String storageType;
    int memorySize;
    String screenResolution;
    double laptopPrice;
    double cpu;

    public void setLaptopFeature(double screenSize, String cpuType, int ramSize, String storageType, int memorySize,
                                 String screenResolution){
        this.screenSize = screenSize;
        this.cpuType = cpuType;
        this.ramSize = ramSize;
        this.storageType = storageType;
        this.memorySize = memorySize;
        this.screenResolution = screenResolution;

    }

    public double getLaptopPrice(){
        Screen(this.screenSize);
        CPU(this.cpuType);
        Ram(this.ramSize);
        Storage(this.storageType, this.memorySize);
        ScreenRes(this.screenResolution);
        return this.laptopPrice;
    }


    public void Screen(double screenSize){
        switch (String.valueOf(screenSize)){
            case "13.3":
                this.laptopPrice += 200;
                break;
            case "15.0":
                this.laptopPrice += 300;
            case "17.3":
                this.laptopPrice += 300;
                break;
        }
    }

    public void CPU(String cpuType){
        switch (String.valueOf(cpuType)){
            case "i3":
                this.laptopPrice += 150;
                break;
            case "i5":
                this.laptopPrice += 250;
            case "i7":
                this.laptopPrice += 350;
                break;
        }
    }

    public void Ram(int ramSize){
        this.laptopPrice += 50*(ramSize/4.0);

    }
    public void Storage(String storageType, int memorySize){
        switch (storageType.toUpperCase()){
            case "HDD":
                this.laptopPrice += 50*(memorySize/500.0);
                break;
            case "SSD":
                this.laptopPrice += 100*(memorySize/500.0);
                break;
        }
    }
    public void ScreenRes(String screenResolution){
        switch (screenResolution.toUpperCase()){
            case "FULLHD":
                this.laptopPrice += 100;
                break;
            case "4K":
                this.laptopPrice += 200;
                break;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select screen size:");
        double screenSize = input.nextDouble();
        System.out.println("Select CPU type:");
        String cpuType = input.next();
        input.nextLine();
        System.out.println("Select RAM size:");
        int ramSize = input.nextInt();
        input.nextLine();
        System.out.println("Select storage type:");
        String storageType = input.nextLine();
        System.out.println("Enter memory size:");
        int memorySize = input.nextInt();
        input.nextLine();
        System.out.println("Enter screen resolution:");
        String screenResolution = input.nextLine();

        Q2LaptopPrice myLaptopPrice = new Q2LaptopPrice();
        myLaptopPrice.setLaptopFeature(screenSize, cpuType, ramSize, storageType, memorySize, screenResolution);

        System.out.println(myLaptopPrice.getLaptopPrice());

    }

}
