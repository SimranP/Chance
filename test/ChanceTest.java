import org.junit.Assert;
import org.junit.Test;

public class ChanceTest {

    @Test
    public void or_should_add_given_chance_and_returns_a_chance_sum() throws Exception {
        Chance chance = Chance.create(0.2);
        Chance sum = chance.or(Chance.create(0.6));
        Assert.assertEquals(sum,Chance.create(0.8));
    }


    @Test
    public void and_should_multiply_given_chance_and_returns_a_chance_product() throws Exception {
        Chance chance = Chance.create(0.5);
        Chance sum = chance.and(Chance.create(0.5));
        Assert.assertEquals(sum,Chance.create(0.25));
    }
}