package assignmentOnArrayNovDay17;

public class Q4CricketScores {
    //Question 4:
    public static void main(String[] args) {
        short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
        short countHalf=0, countCentury=0, countDouble=0;
        for(short each : scores){
            if(each>=50 && each<100) countHalf++;
            else if(each>=100 && each<200) countCentury++;
            else if(each>=200) countDouble++;
        }
        System.out.println("half-century: "+countHalf + "\ncentury: "+countCentury +
                "\ndouble-century: " + countDouble);
    }
}
