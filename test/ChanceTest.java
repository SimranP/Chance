import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ChanceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void or_should_add_given_chance_and_returns_a_chance_sum() throws Exception {
        Chance chance = Chance.create(0.2);
        Chance sum = chance.or(Chance.create(0.6));
        Assert.assertEquals(sum,Chance.create(0.8));
    }


    @Test
    public void and_should_multiply_given_chance_and_returns_a_chance_product() throws Exception {
        Chance chance = Chance.create(0.5);
        Chance product = chance.and(Chance.create(0.5));
        Assert.assertEquals(product,Chance.create(0.25));
    }

    @Test
    public void not_should_give_not_of_the_chance() throws Exception {
        Chance chance = Chance.create(0.75);
        Chance notChance = chance.not();
        Assert.assertEquals(notChance,Chance.create(0.25));
    }

    @Test
    public void create_throws_an_exception_when_the_given_probability_value_is_illegal() throws Exception {
        thrown.expect(IllegalProbablityValueException.class);
        Chance.create(1.1);
    }
}