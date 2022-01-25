package day33_Constructors;

public class Bus{
    //pre-conditions from user
    private String usagePurpose; //first priority
    private boolean manAuto; //secondary priority
    private boolean climateAC; //third priority

    //dependent variables on pre-conditions
    private String make;
    private int maxSpeed; // for auto - 150KM, for manual - 110KM (default value)
    private boolean glareShield; // for climateAC - glareShield is a must, otherwise no need
    private String busColor; // for a school bus - Yellow, for commute - Red

    //default variables on pre-conditions
    private int numOfDoors;
    private int numOfSeats;

    protected Bus(){}

    protected Bus(String make){
        ConstructBus(make); // a basic bus will be created
    }

    protected Bus(String usagePurpose, String make){
        this(make);
        this.usagePurpose = usagePurpose;
        if(this.usagePurpose.equalsIgnoreCase("School")){
            this.busColor = "Yellow";
            this.maxSpeed = 110;
        }else if(this.usagePurpose.equalsIgnoreCase("Commute")){
            this.busColor = "Red";
        }else{
            this.manAuto = true;
        }
    }

    protected Bus(String usagePurpose, String make, boolean manAuto){
        this(usagePurpose, make);
        if(manAuto){
            this.climateAC = true;
        }
    }

    @Override
    public String toString() {
        return "Bus{" +
                "usagePurpose='" + usagePurpose + '\'' +
                ", manAuto=" + manAuto +
                ", climateAC=" + climateAC +
                ", make='" + make + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", glareShield=" + glareShield +
                ", busColor='" + busColor + '\'' +
                ", numOfDoors=" + numOfDoors +
                ", numOfSeats=" + numOfSeats +
                '}';
    }

    public Bus(String usagePurpose, String make, boolean manAuto, boolean climateAC) { //according to usagePurpose and manAuto state, color can change
        this(usagePurpose, make, manAuto);
        if(this.climateAC){
            this.glareShield = true;
        }
    }

    private void ConstructBus(String make){
        this.usagePurpose = "Regular";
        this.make = make;
        this.manAuto = false;
        this.maxSpeed = 150;
        this.busColor = "White";
        this.numOfSeats = 45;
        this.numOfDoors = 4;
    }

    public void printOut(){
        System.out.println("Your " + this.make + " " + this.usagePurpose + " bus has been built");
        if(this.manAuto){
            System.out.println("Shift: Auto");
        }else{
            System.out.println("Shift: Manual");
        }
        if(this.climateAC){
            System.out.println("AC: included");
            System.out.println("Glare shield: included");
        }else {
            System.out.println("AC: not included");
            System.out.println("Glare shield: not included");
        }

        System.out.println("Color: " + this.busColor);
        System.out.println("Number of seats: " + this.numOfSeats);
        System.out.println("Max speed: " + this.maxSpeed);
        System.out.println("____________________________________");
    }
}
