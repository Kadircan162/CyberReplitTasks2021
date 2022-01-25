package day37Inheritance;

public class Human {

    static int num4 = 400;

    public Human(){
        System.out.println("First of all I'm a human");
    }

    public Human(String differencesFromOtherSpecies){

        System.out.println("differencesFromOtherSpecies = " + differencesFromOtherSpecies);

    }

    public void m1Public(){}
    protected void m2Protected(){}
    void m3Default(){}
    private void m4Private(){}
    final void m5FinalMethod(){}
    static void m6StaticMethod(){}

    public Human m5Covariant(){
        return new African();
    }

    String ancestors;
    int age = 15;
    private String body = "Common body shape";
    int dateOfBirth = -100;
    private int moneyIncome;
    int lifeTime;
    static String season = "Every continent have different seasons";

    public static void dayTime(){
        System.out.println("Lots of different daytime of a human being");
    }

    public String getBody() {
        return body;
    }

    public int getMoneyIncome() {
        return moneyIncome;
    }

    public void walk(){
        System.out.println("I can walk");
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setMoneyIncome(int moneyIncome) {
        this.moneyIncome = moneyIncome;
    }
}
