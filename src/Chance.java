/*
    Job of Chance
        - should tell the chances of occurrence of by using favourableChances and totalChances.
        - should tell the chances of not occurring by using favourableChances and totalChances.
 */

public class Chance {
    private double favourableChances;
    private double totalChances;

    public Chance(double favourableChances, double totalChances) {
        this.favourableChances = favourableChances;
        this.totalChances = totalChances;
    }


    public double occurrence(){
        return favourableChances/totalChances;
    }

    public double nonOccurrence(){
        return (totalChances-favourableChances)/totalChances;
    }
}