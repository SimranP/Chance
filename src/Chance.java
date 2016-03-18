/*
    Job of Chance
        - should perform all the calculations done between chances.
 */


public class Chance {
    private double value;

    private Chance(double value) {
        this.value = value;
    }


    public static Chance create(double value) {
        if(value < 0 || value > 1){
            throw new IllegalProbablityValueException("Expected value between 0 and 1 but got "+ value);
        }
        return new Chance(value);
    }

    public Chance or(Chance chance) {
        return new Chance(Double.sum(value,chance.value));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chance chance = (Chance) o;
        return Double.compare(chance.value, value) == 0;
    }

    public Chance and(Chance chance) {
        return create(this.value * chance.value);
    }

    public Chance not() {
        return create(1-value);
    }

}