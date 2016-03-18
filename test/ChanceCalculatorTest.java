import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ChanceCalculatorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void ofOccurring_should_tell_the_chance_of_occurring_when_favourable_space_is_less_than_total_space() throws Exception {
        double totalSpace = 2 , favourableSpace = 1;
        ChanceCalculator chanceCalculator = new ChanceCalculator(totalSpace);
        Assert.assertEquals(Chance.create(0.5),chanceCalculator.ofOccurring(favourableSpace));
    }

    @Test
    public void ofOccurring_should_tell_the_chance_of_occurring_when_favourable_space_is_equal_to_total_space() throws Exception {
        double totalSpace = 2 , favourableSpace = 2;
        ChanceCalculator chanceCalculator = new ChanceCalculator(totalSpace);
        Assert.assertEquals(Chance.create(1),chanceCalculator.ofOccurring(favourableSpace));
    }

    @Test
    public void ofOccurring_should_throw_Exception_when_favourable_space_is_more_than_total_space() throws Exception {
        double totalSpace = 2 , favourableSpace = 3;
        ChanceCalculator chanceCalculator = new ChanceCalculator(totalSpace);
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Expected value between 0 and 1 but got 1.5");
        chanceCalculator.ofOccurring(favourableSpace);
    }

    @Test
    public void ofNotOccurring_should_tell_the_chance_of_occurring_when_favourable_space_is_less_than_total_space() throws Exception {
        double totalSpace = 2 , favourableSpace = 1;
        ChanceCalculator chanceCalculator = new ChanceCalculator(totalSpace);
        Assert.assertEquals(Chance.create(0.5),chanceCalculator.ofNotOccurring(favourableSpace));
    }

    @Test
    public void ofNotOccurring_should_tell_the_chance_of_occurring_when_favourable_space_is_equal_to_total_space() throws Exception {
        double totalSpace = 2 , favourableSpace = 2;
        ChanceCalculator chanceCalculator = new ChanceCalculator(totalSpace);
        Assert.assertEquals(Chance.create(0),chanceCalculator.ofNotOccurring(favourableSpace));
    }

    @Test
    public void ofNotOccurring_should_throw_Exception_when_favourable_space_is_more_than_total_space() throws Exception {
        double totalSpace = 2 , favourableSpace = 3;
        ChanceCalculator chanceCalculator = new ChanceCalculator(totalSpace);
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Expected value between 0 and 1 but got -0.5");
        chanceCalculator.ofNotOccurring(favourableSpace);
    }
}
