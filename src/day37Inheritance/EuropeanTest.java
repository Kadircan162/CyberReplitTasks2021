package day37Inheritance;


public class EuropeanTest {

    public void test(){
        System.out.println("Human.season = " + Human.season);
    }

    public static void main(String[] args) {

//        European european = new European();
//
//        european.lifeTime = 85;
//        european.ancestors = "Vikings";
//        european.setBody("Slim and tall");
//        european.setMoneyIncome(15_000);
//
//        System.out.println("european.getBody() = " + european.getBody());
//        System.out.println("european.getMoneyIncome() = " + european.getMoneyIncome());



        European european1 = new European("As a human, I'm superior of any species on Earth");
        european1.season = "Yes, in Europe we have rainy season";

        European european = new European();
        european.dayTime();
        European.dayTime();
        Human.dayTime();
        european.season = "In Africa, we have a dry season";
        european.m5FinalMethod();
        european.m6StaticMethod();

        European.season = "In Russia, we have all year snow and cold";
        Human.season = "In Asia we have bozkır season";
        System.out.println("Human.season = " + Human.season);
        System.out.println("European.season = " + European.season);

        european.m1Public();
        european.m2Protected();
        european.m3Default();
        System.out.println("european.toString() = " + european.toString());

        AfricanAmerican africanAmerican = new AfricanAmerican();
        System.out.println("africanAmerican.toString() = " + africanAmerican.toString());

    }
}
