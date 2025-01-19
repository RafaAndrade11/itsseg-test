package tests;

import exercises.UtilityMethods;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExerciseThreeTest {
    UtilityMethods utilityMethods = new UtilityMethods();

    @Test
    public void shouldReturnHighestAndLowestWhenSentenceContainsOnlyPositiveNumbers() {
        String input = "1 2 3 4 5";
        String expected = "5 1";
        assertEquals(expected, utilityMethods.findHighestAndLowestNumber(input));
    }
    @Test
    public void shouldReturnHighestAndLowestWhenLastNumberIsNegative() {
        String input = "1 9 3 4 -5";
        String expected = "9 -5";
        assertEquals(expected, utilityMethods.findHighestAndLowestNumber(input));
    }
    @Test
    public void shouldReturnHighestAndLowestWhenMiddleNumberIsNegative() {
        String input = "1 2 -3 4 5";
        String expected = "5 -3";
        assertEquals(expected, utilityMethods.findHighestAndLowestNumber(input));
    }
}
