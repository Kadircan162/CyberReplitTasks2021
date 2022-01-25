package day37Inheritance;


public class European extends Human{

    String color;
    String language;
    int age = 90;

    public European(){



        System.out.println("super.age = " + super.age);
        System.out.println("age = " + age);
        System.out.println("super.dateOfBirth = " + super.dateOfBirth);
        System.out.println("dateOfBirth = " + dateOfBirth);
    }

    public European(String differenceFromOtherSpecies){
        super(differenceFromOtherSpecies);

    }

    public static void main(String[] args) {
        European european = new European();
        european.dayTime();
        European.dayTime();
        Human.dayTime();
        System.out.println("european.age = " + european.age);

        System.out.println("num4 = " + num4);


    }

    @Override
    public void m1Public() {
        super.m1Public();

    }

    @Override
    protected void m2Protected() {
        super.m2Protected();
    }

    @Override
    void m3Default() {
        super.m3Default();
    }

    @Override
    public AfricanAmerican m5Covariant() {
        return new AfricanAmerican();
    }

    @Override
    public String toString() {
        return "European{" +
                "color='" + color + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", ancestors='" + ancestors + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", lifeTime=" + lifeTime +
                '}';
    }
}
