import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChanceTest {

    @Test
    public void occurance_should_tell_the_probability_of_tail() throws Exception {
        Chance chance = new Chance(1,2);
        assertEquals(0.5,chance.occurrence(),0.001);
    }

    @Test
    public void nonoccurence_should_tell_the_probability_of_not_getting_tail() throws Exception {
        Chance chance = new Chance(1,2);
        assertEquals(0.5,chance.nonOccurrence(),0.001);
    }

    @Test
    public void occurance_should_tell_the_chances_of_getting_tails_when_there_are_two_coins() throws Exception {
        Chance chance = new Chance(2, 4);
        assertEquals(0.5,chance.occurrence(),0.001);
    }

    @Test
    public void nonoccurence_should_tell_the_chances_of_not_getting_tails_when_there_are_two_coins() throws Exception {
        Chance chance = new Chance(2, 4);
        assertEquals(0.5,chance.nonOccurrence(),0.001);
    }
}
