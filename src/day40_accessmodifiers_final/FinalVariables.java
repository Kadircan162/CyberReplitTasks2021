package day40_accessmodifiers_final;

public class FinalVariables {

    public final int ROADSTER_MAX_RANGE = 600;
    public final int MODEL_3_MAXSPEED;
    public final int MODEL_X_PASSENGERS;
    public static final String ADMIN_USERNAME;

    public FinalVariables() {
        MODEL_3_MAXSPEED = 200;
        //ADMIN_USERNAME = "Ozzy";

    }

    {
        MODEL_X_PASSENGERS = 7;
    }

    static {

        ADMIN_USERNAME = "Ozzy";
    }

    public static void main(String[] args) {

        final int MAX_PASSENGERS_COUNT=5;

        final int SSN ;
        SSN=66;
        //SSN++;

        FinalVariables fv = new FinalVariables();
        System.out.println(fv.ROADSTER_MAX_RANGE);
        System.out.println(fv.MODEL_3_MAXSPEED);
        System.out.println(FinalVariables.ADMIN_USERNAME);
        System.out.println(ADMIN_USERNAME); //I can call the final variable ADMIN_USERNAME by its name since it is in my current class.
                                            //What if I want to call it from another class with the same way using only its name:
                                            //Answer: I should use static import the class.

    }
}
