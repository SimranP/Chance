/*
    Job of Chance
        - should tell the chances of occurrence of by using favourableChances and totalChances.
        - should tell the chances of not occurring by using favourableChances and totalChances.
 */


public class Chance {
    private double value;

    private Chance(double value) {
        this.value = value;
    }


    public static Chance create(double value) throws IllegalArgumentException {
        if(value < 0 || value > 1){
            throw new IllegalArgumentException("Expected value between 0 and 1 but got "+ value);
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
}