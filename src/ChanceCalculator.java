public class ChanceCalculator {
    private double totalSpace;

    public ChanceCalculator(double totalSpace) {
        this.totalSpace = totalSpace;
    }

    public Chance ofOccurring(double favourableSpace) {
        return Chance.create(favourableSpace/totalSpace);
    }

    public Chance ofNotOccurring(double favourableSpace) {
        return Chance.create(1-(favourableSpace/totalSpace));
    }
}
