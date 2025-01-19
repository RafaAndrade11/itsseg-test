package tests;

import exercises.UtilityMethods;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExerciseSixTest {
    UtilityMethods utilityMethods = new UtilityMethods();

    @Test
    public void shouldReturn72WhenNumberIs2520() {
        int result = utilityMethods.returnSumOfDigits(2520);
        assertEquals(72, result);
    }
    @Test
    public void shouldReturn13WhenNumberIs121() {
        int result = utilityMethods.returnSumOfDigits(121);
        assertEquals(13, result);
    }
    @Test
    public void shouldReturn22WhenNumberIs1039() {
        int result = utilityMethods.returnSumOfDigits(1039);
        assertEquals(22, result);
    }
    @Test
    public void shouldReturn100WhenNumberIs22225555() {
        int result = utilityMethods.returnSumOfDigits(22225555);
        assertEquals(100, result);
    }
}
